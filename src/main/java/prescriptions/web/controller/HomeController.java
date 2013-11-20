package prescriptions.web.controller;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import prescriptions.domain.CorruptedDataException;
import prescriptions.domain.entity.Alfabeta;
import prescriptions.domain.entity.Caratula;
import prescriptions.domain.entity.Prescription;
import prescriptions.domain.entity.Price;
import prescriptions.domain.entity.Role;
import prescriptions.domain.repositories.AlfabetaRepo;
import prescriptions.domain.repositories.CaratulaRepo;
import prescriptions.domain.repositories.PrescriptionRepo;
import prescriptions.domain.repositories.PriceRepo;
import prescriptions.domain.repositories.RoleRepo;
import prescriptions.web.validation.PrescriptionForm;
import prescriptions.web.validators.PrescriptionFormValidator;
import prescriptions.web.wrappers.AlfabetaWrapper;

@Controller
@SessionAttributes("userId")
@RequestMapping("/")
public class HomeController {

	private RoleRepo roleRepo;
	private PrescriptionRepo prescriptionRepo;
	private PriceRepo priceRepo;
	private AlfabetaRepo alfabetaRepo;
	private CaratulaRepo caratulaRepo;
	
	private PrescriptionFormValidator prescriptionFormValidator;
	
	@Autowired
	public HomeController(RoleRepo roleRepo, PrescriptionRepo prescriptionRepo, AlfabetaRepo alfabetaRepo, 
						PriceRepo priceRepo, PrescriptionFormValidator prescriptionFormValidator, CaratulaRepo caratulaRepo) {
		this.roleRepo = roleRepo;
		this.prescriptionRepo = prescriptionRepo;
		this.alfabetaRepo = alfabetaRepo;
		this.priceRepo = priceRepo;
		this.caratulaRepo = caratulaRepo;
		this.prescriptionFormValidator = prescriptionFormValidator;
	}
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("home/home");
	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("home/login");
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView mav = new ModelAndView("home/add");
		mav.addObject("prescriptionForm", new PrescriptionForm());
		return mav;
	}
	
	@RequestMapping(value = "edit/{prescriptionId}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable Integer prescriptionId, HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("home/add");
		Prescription prescription = prescriptionRepo.get(prescriptionId);
		if (prescription.getCreator().getId() == (Integer)httpSession.getAttribute("userId")) {
			mav.addObject("prescriptionForm", new PrescriptionForm(prescription));
		}
		return mav;
	}
	
	@RequestMapping(value = "alfabeta", method = RequestMethod.GET)
	@ResponseBody
	public AlfabetaWrapper alfabeta(@RequestParam("barras") String barras, @RequestParam("fecha") Integer fecha) throws ParseException {
		Alfabeta alfabeta = alfabetaRepo.getByBarras(barras);
		if (alfabeta != null) { 
			List<Price> price = priceRepo.getByRegistro(alfabeta.getRegistro());
			return new AlfabetaWrapper(price, alfabeta, fecha);
		}
		return null;
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView list(HttpSession session) {
		Integer userId = (Integer) session.getAttribute("userId");
		Role person = roleRepo.get(userId);
		ModelAndView mav = new ModelAndView("home/list");
		mav.addObject("user", person);
		return mav;
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView add(PrescriptionForm prescriptionForm, Errors errors, @ModelAttribute("userId") Integer userId) {
		ModelAndView mav = new ModelAndView("home/add");
		Role user = roleRepo.get(userId);
		this.prescriptionFormValidator.validate(prescriptionForm, errors);
		if (errors.hasErrors()) {
			mav.addObject("errors", errors);
			return mav;
		}
		try {
			Prescription prescription = prescriptionForm.build(this.prescriptionRepo);
			prescription.setCreator(user);;
			Caratula carat = this.getCaratula(prescription.getSer_carat(), prescription.getCod_carat());
			carat.cargar();
			prescriptionRepo.save(prescription);
		} catch (CorruptedDataException e) {
			errors.rejectValue("username", "corrupt");
			return null;
		}
		mav.addObject("cargado", true);

		return mav;
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@RequestParam String username, @RequestParam String password, HttpSession session) {
		Role user = roleRepo.getByUsername(username);
		if (user != null && user.getPassword().equals(password))
			session.setAttribute("userId", user.getId());
		return "redirect:/prescriptions/home";	
	}
	
	@RequestMapping(value = "getCaratula", method = RequestMethod.GET)
	@ResponseBody
	public Caratula getCaratula(@RequestParam("ser_carat") String ser_carat, @RequestParam("cod_carat") Integer cod_carat) {
		Caratula carat = caratulaRepo.get(ser_carat, cod_carat);
		if (carat == null) {
			carat = new Caratula(ser_carat, cod_carat);
			caratulaRepo.save(carat);
		}
		return carat;
	}

}
