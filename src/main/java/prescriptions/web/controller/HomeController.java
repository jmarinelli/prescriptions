package prescriptions.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import prescriptions.domain.CorruptedDataException;
import prescriptions.domain.entity.Alfabeta;
import prescriptions.domain.entity.Prescription;
import prescriptions.domain.entity.Price;
import prescriptions.domain.entity.Role;
import prescriptions.domain.repositories.AlfabetaRepo;
import prescriptions.domain.repositories.PrescriptionRepo;
import prescriptions.domain.repositories.PriceRepo;
import prescriptions.domain.repositories.RoleRepo;
import prescriptions.web.validation.PrescriptionForm;
import prescriptions.web.validators.PrescriptionFormValidator;

@Controller
@SessionAttributes("userId")
@RequestMapping("/")
public class HomeController {

	private RoleRepo roleRepo;
	private PrescriptionRepo prescriptionRepo;
	private PriceRepo priceRepo;
	private AlfabetaRepo alfabetaRepo;
	
	private PrescriptionFormValidator prescriptionFormValidator;
	
	@Autowired
	public HomeController(RoleRepo roleRepo, PrescriptionRepo prescriptionRepo, AlfabetaRepo alfabetaRepo, 
						PriceRepo priceRepo, PrescriptionFormValidator prescriptionFormValidator) {
		this.roleRepo = roleRepo;
		this.prescriptionRepo = prescriptionRepo;
		this.alfabetaRepo = alfabetaRepo;
		this.priceRepo = priceRepo;
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
	
	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public ModelAndView edit(@RequestParam("prescriptionId") Integer prescriptionId, HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("home/add");
		Prescription prescription = prescriptionRepo.get(prescriptionId);
		if (prescription.getCreator().getId() == (Integer)httpSession.getAttribute("userId")) {
			PrescriptionForm form = new PrescriptionForm();
			form.setPrescription(prescription);
			mav.addObject("prescriptionForm", form);
		}
		return mav;
	}
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public void test() {
		Price price = priceRepo.getByRegistro(5);
		Alfabeta alfabeta = alfabetaRepo.getByTroquel("9900009");
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView add(PrescriptionForm prescriptionForm, Errors errors, @ModelAttribute("userId") Integer userId) {

		Role user = roleRepo.get(userId);
		this.prescriptionFormValidator.validate(prescriptionForm, errors);
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("home/add");
			mav.addObject("errors", errors);
			return mav;
		}
		try {
			Prescription prescription = prescriptionForm.build();
			prescription.setCreator(user);
			prescriptionRepo.save(prescription);
		} catch (CorruptedDataException e) {
			errors.rejectValue("username", "corrupt");
			return null;
		}

		return new ModelAndView();
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@RequestParam String username, @RequestParam String password, HttpSession session) {
		Role user = roleRepo.getByUsername(username);
		if (user != null && user.getPassword().equals(password))
			session.setAttribute("userId", user.getId());
		return "redirect:/prescriptions/add";	
	}

}
