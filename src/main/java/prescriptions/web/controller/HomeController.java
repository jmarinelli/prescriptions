package prescriptions.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import prescriptions.domain.CorruptedDataException;
import prescriptions.domain.entity.Prescription;
import prescriptions.domain.entity.Role;
import prescriptions.domain.repositories.PrescriptionRepo;
import prescriptions.domain.repositories.RoleRepo;
import prescriptions.web.validation.PrescriptionForm;
import prescriptions.web.validators.PrescriptionFormValidator;

@Controller
@RequestMapping("/")
public class HomeController {

	private RoleRepo roleRepo;
	private PrescriptionRepo prescriptionRepo;
	
	private PrescriptionFormValidator prescriptionFormValidator;
	
	@Autowired
	public HomeController(RoleRepo roleRepo, PrescriptionRepo prescriptionRepo, PrescriptionFormValidator prescriptionFormValidator) {
		this.roleRepo = roleRepo;
		this.prescriptionRepo = prescriptionRepo;
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
	
//	@RequestMapping(value = "show", method = RequestMethod.GET)
//	public ModelAndView show() {
//		ModelAndView mav = new ModelAndView("home/show");
//		List<Test> tests = testRepo.getAll();
//		
//		
//		mav.addObject("tests", tests);
//		
//		
//		return mav;
//	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(PrescriptionForm prescriptionForm, Errors errors) {

		this.prescriptionFormValidator.validate(prescriptionForm, errors);
		if (errors.hasErrors())
			return null;
		
		try {
			Prescription prescription = prescriptionForm.build();
			prescriptionRepo.save(prescription);
		} catch (CorruptedDataException e) {
			errors.rejectValue("username", "corrupt");
			return null;
		}

		return "redirect:/prescriptions/add";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@RequestParam String username, @RequestParam String password, HttpSession session) {
		Role user = roleRepo.getByUsername(username);
		if (user != null && user.getPassword().equals(password))
			session.setAttribute("userId", user.getId());
		return "redirect:/prescriptions/show";	
	}

}
