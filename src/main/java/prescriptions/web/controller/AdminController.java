package prescriptions.web.controller;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import prescriptions.domain.entity.Prescription;
import prescriptions.domain.entity.Role;
import prescriptions.domain.repositories.PrescriptionRepo;
import prescriptions.domain.repositories.RoleRepo;

@Controller
@RequestMapping("admin")
public class AdminController {
	
	private RoleRepo roleRepo;
	private PrescriptionRepo prescriptionsRepo;
	
	@Autowired
	public AdminController(RoleRepo roleRepo, PrescriptionRepo prescriptionsRepo) {
		this.roleRepo = roleRepo;
		this.prescriptionsRepo = prescriptionsRepo;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView admin() {
		ModelAndView mav = new ModelAndView("admin/home");
		mav.addObject("users", roleRepo.findAll());
		return mav;
	}
	
	@RequestMapping(value = "user/{userId}", method = RequestMethod.GET)
	public ModelAndView user(@PathVariable Integer userId) {
		Role role = roleRepo.get(userId);
		ModelAndView mav = new ModelAndView("home/list");
		mav.addObject("user", role);
		return mav;
	}
	
	@RequestMapping(value = "create-user", method = RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("admin/create-user");
	}
	
	@RequestMapping(value = "create-user", method = RequestMethod.POST)
	public String create(@RequestParam String username, @RequestParam String password) {
		roleRepo.save(new Role(username, password));
		return "redirect:";
	}

	@RequestMapping(value = "dump", method = RequestMethod.GET)
	public String dump(@RequestParam String serCarat) throws FileNotFoundException, UnsupportedEncodingException {
		List<Prescription> presc = this.prescriptionsRepo.getBySerCarat(serCarat);
		
		PrintWriter writer = new PrintWriter("dump.txt", "UTF-8");
		
		for (Prescription p : presc) {
			
			writer.println(p);
		}
		
		writer.close();
		
		return "redirect:";
	}
}