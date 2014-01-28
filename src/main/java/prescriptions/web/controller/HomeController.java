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

import prescriptions.domain.entity.Alfabeta;
import prescriptions.domain.entity.Caratula;
import prescriptions.domain.entity.Convenio;
import prescriptions.domain.entity.Prescription;
import prescriptions.domain.entity.Price;
import prescriptions.domain.entity.Role;
import prescriptions.domain.repositories.AlfabetaRepo;
import prescriptions.domain.repositories.CaratulaRepo;
import prescriptions.domain.repositories.ConvenioRepo;
import prescriptions.domain.repositories.PrescriptionRepo;
import prescriptions.domain.repositories.PriceRepo;
import prescriptions.domain.repositories.RoleRepo;
import prescriptions.web.validation.PrescriptionForm;
import prescriptions.web.validators.PrescriptionFormValidator;
import prescriptions.web.wrappers.AlfabetaWrapper;

@Controller
@SessionAttributes("userId")
@RequestMapping("/home")
public class HomeController {

	private RoleRepo roleRepo;
	private PrescriptionRepo prescriptionRepo;
	private PriceRepo priceRepo;
	private AlfabetaRepo alfabetaRepo;
	private CaratulaRepo caratulaRepo;
	private ConvenioRepo convenioRepo;
	
	private PrescriptionFormValidator prescriptionFormValidator;
	
	@Autowired
	public HomeController(RoleRepo roleRepo, PrescriptionRepo prescriptionRepo, AlfabetaRepo alfabetaRepo, 
						PriceRepo priceRepo, PrescriptionFormValidator prescriptionFormValidator, CaratulaRepo caratulaRepo, ConvenioRepo convenioRepo) {
		this.roleRepo = roleRepo;
		this.prescriptionRepo = prescriptionRepo;
		this.alfabetaRepo = alfabetaRepo;
		this.priceRepo = priceRepo;
		this.caratulaRepo = caratulaRepo;
		this.convenioRepo = convenioRepo;
		this.prescriptionFormValidator = prescriptionFormValidator;
	}
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView home(HttpSession session) {
		ModelAndView mav = new ModelAndView("home/home");
		mav.addObject("isAdmin", roleRepo.get((Integer)session.getAttribute("userId")).isAdmin());
		return mav;
	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("home/login");
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		return new ModelAndView("home/login");
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView add(
			@RequestParam(required = false, value = "status") String status,
			@RequestParam(required = false, value = "cod_carat") String cod_carat,
			@RequestParam(required = false, value = "ser_carat") String ser_carat,
			@RequestParam(required = false, value = "fec_prescr") String fec_prescr,
			@RequestParam(required = false, value = "fec_disp") String fec_disp,
			@RequestParam(required = false, value = "let_matricula") String let_matricula,
			@RequestParam(required = false, value = "convenio") String convenio) {
		ModelAndView mav = new ModelAndView("home/add");
		mav.addObject("status", "'" + (status != null ? status : "none") + "'");
		PrescriptionForm form = new PrescriptionForm();
		try {
			if (ser_carat != null) {
				form.setFix_ser_carat(true);
				form.setSer_carat(ser_carat);
			}
			if (cod_carat != null) {
				form.setFix_cod_carat(true);
				form.setCod_carat(Integer.valueOf(cod_carat));
			}
			if (fec_prescr != null) {
				form.setFix_fec_prescr(true);
				form.setFec_prescr(Integer.valueOf(fec_prescr));
			}
			if (fec_disp != null) {
				form.setFix_fec_disp(true);
				form.setFec_disp(Integer.valueOf(fec_disp));
				
			}
			if (let_matricula != null) {
				form.setFix_let_matricula(true);
				form.setLet_matricula(let_matricula);
			}
			if (convenio != null) {
				form.setFix_convenio(true);
				form.setConvenio(convenio);
			} else {
				form.setConvenio("");
			}
		} catch (Exception e) {
			mav.addObject("status", "Valor a fijar invalido");
		}
		mav.addObject("prescriptionForm", form);
		mav.addObject("convenios", convenioRepo.getAll());
		return mav;
	}
	
	@RequestMapping(value = "edit/{prescriptionId}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable Integer prescriptionId, HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("home/add");
		Prescription prescription = prescriptionRepo.get(prescriptionId);
		Role user = roleRepo.get((Integer)httpSession.getAttribute("userId"));
		if (prescription.getCreator().getId() == (Integer)httpSession.getAttribute("userId") 
				|| user.isAdmin()) {
			mav.addObject("prescriptionForm", new PrescriptionForm(prescription));
		}
		return mav;
	}
	
	@RequestMapping(value = "alfabeta", method = RequestMethod.GET)
	@ResponseBody
	public AlfabetaWrapper alfabeta(@RequestParam("barras") String barras, @RequestParam("fecha") Integer fecha) throws ParseException {
		Alfabeta alfabeta = alfabetaRepo.getByBarras(barras);
		if (alfabeta == null) {
			alfabeta = alfabetaRepo.getByTroquel(barras);
		}
		if (alfabeta != null) { 
			List<Price> price = priceRepo.getByRegistro(alfabeta.getRegistro());
			return new AlfabetaWrapper(price, alfabeta, fecha);
		}
		return null;
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(required = false, value = "status") String status, HttpSession session) {
		Integer userId = (Integer) session.getAttribute("userId");
		Role person = roleRepo.get(userId);
		ModelAndView mav = new ModelAndView("home/list");
		mav.addObject("user", person);
		mav.addObject("status", status);
		return mav;
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(PrescriptionForm prescriptionForm, Errors errors, @ModelAttribute("userId") Integer userId) {
		ModelAndView mav = new ModelAndView("home/add");
		Role user = roleRepo.get(userId);
		this.prescriptionFormValidator.validate(prescriptionForm, errors);
		if (errors.hasErrors()) {
			mav.addObject("errors", errors);
			return null;
		}
		if (prescriptionForm.getPrescription() == null) {
			Prescription prescription = prescriptionForm.build(this.prescriptionRepo);
			prescription.setCreator(user);
			if (prescriptionRepo.save(prescription)) {
				Caratula carat = this.getCaratula(prescription.getSer_carat(), prescription.getCod_carat());
				carat.cargar();
				mav.addObject("message", "'Receta cargada'");
				String url = "redirect:add?status=success";
				if (prescriptionForm.isFix_cod_carat())
					url += "&cod_carat=" + prescriptionForm.getCod_carat();
				if (prescriptionForm.isFix_ser_carat())
					url += "&ser_carat=" + prescriptionForm.getSer_carat();
				if (prescriptionForm.isFix_fec_prescr())
					url += "&fec_prescr=" + prescriptionForm.getFec_prescr();
				if (prescriptionForm.isFix_fec_disp())
					url += "&fec_disp=" + prescriptionForm.getFec_disp();
				if (prescriptionForm.isFix_let_matricula())
					url += "&let_matricula=" + prescriptionForm.getLet_matricula();
				if (prescriptionForm.isFix_convenio())
					url += "&convenio=" + prescriptionForm.getConvenio();
				return url;
			} else {
				errors.rejectValue("duplicated", "duplicated");
				mav.addObject("errors", errors);
				return null;
			}
		} else {
			prescriptionForm.update();
			mav.addObject("message", "'Receta actualizada");
			return "redirect:list?status=success";
		}	
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@RequestParam String username, @RequestParam String password, HttpSession session) {
		Role user = roleRepo.getByUsername(username);
		if (user != null && user.getPassword().equals(password)) {
			session.setAttribute("userId", user.getId());
			return "redirect:home";
		}
		return null;
	}
	
	@RequestMapping(value = "getCaratula", method = RequestMethod.GET)
	@ResponseBody
	public Caratula getCaratula(@RequestParam("ser_carat") String ser_carat, @RequestParam("cod_carat") Integer cod_carat) {
		Caratula carat = caratulaRepo.get(ser_carat.toUpperCase(), cod_carat);
		if (carat == null) {
			carat = new Caratula(ser_carat, cod_carat);
			caratulaRepo.save(carat);
		}
		return carat;
	}
	
	@RequestMapping(value = "convenio", method = RequestMethod.GET)
	@ResponseBody
	public Convenio getConvenio(@RequestParam String name) {
		if (name == null)
			return null;
		return convenioRepo.get(name);
	}

}
