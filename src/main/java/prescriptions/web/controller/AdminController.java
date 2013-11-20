package prescriptions.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import prescriptions.domain.entity.Role;
import prescriptions.domain.repositories.RoleRepo;

@Controller
@RequestMapping("admin")
public class AdminController {
	
	private RoleRepo roleRepo;
	
	@Autowired
	public AdminController(RoleRepo roleRepo) {
		this.roleRepo = roleRepo;
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

}
