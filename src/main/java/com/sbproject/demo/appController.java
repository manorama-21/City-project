package com.sbproject.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class appController {

	
	@Autowired
	private UserService userService;
	
	@GetMapping("admindetail")
	public String admindetail(Model model) {
		model.addAttribute("data", userService.getUsers());
		return "admindetail";
	}
	
	@GetMapping("adminreg")
	public String adminreg(Model model){
		User user = new User();
		model.addAttribute("user", user);
		return "adminreg";
	}
	
	@PostMapping("saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "admin";
	}
	
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable(value="id") long id) {
		userService.deleteUser(id);
		return "admindetail";
	}
	
	@GetMapping("/updateForm/{id}")
	public String updateForm(@PathVariable(value="id") long id, Model model) {
		Optional <User> user= userService.getUserById(id);
		model.addAttribute("data", user);
		return "updateUser";
	}	
}
