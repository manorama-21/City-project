package com.sbproject.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class homeController {
	/*
	 * @Autowired private AdminService adminService;
	 */
	
	private final UserService userService;
	private final EmailService emailService;
	
	
	@Autowired
	
	public homeController(UserService userService, EmailService emailService ) {
		this.userService = userService;
		this.emailService = emailService;
	}
	
	

	 @GetMapping("/")
	 public String home() {
		 return "index";
	 }
	 
	 @GetMapping("/index")
	 public String index() {
		 return "index";
	 }
	 
	 
	 @GetMapping("/about")
	 public String about() {
		 return "about";
	 }
	 
	 @GetMapping("/admin")
	 public String admin() {
		 return "admin";
	 }
		/*
		 * @GetMapping("adminreg") public String adminreg() {
		 * 
		 * return "adminreg"; }
		 */
	 
	 @GetMapping("/admin_home")
	 public String admin_home() {
		 return "admin_home";
	 }
	 
	 @GetMapping("/addcategory")
	 public String addcategory() {
		 return "addcategory";
	 }
	 
	 @GetMapping("/addcity")
	 public String addcity() {
		 return "addcity";
	 }
	 
	 @GetMapping("addplaces")
	 public String addplaces() {
		 return "addplaces";
	 }
	 
	 @GetMapping("/contact")
	 public String contact() {
		 return "contact";
	 }
	 
	 @GetMapping("/hosprayag")
	 public String hosprayag() {
		 return "hosprayag";
	 }
	 
	 @GetMapping("/mallprayag")
	 public String mallprayag() {
		 return "mallprayag";
	 }
	 
	 @GetMapping("/tourprayag")
	 public String tourprayag() {
		 return "tourprayag";
	 }
	 @GetMapping("/school")
	 public String school() {
		 return "school";
	 }
	 @GetMapping("/college")
	 public String college() {
		 return "college";
	 }
	 
	 @GetMapping("/temple")
	 public String temple() {
		 return "temple";
	 }
	 
	 @GetMapping("/restaurant")
	 public String restaurant() {
		 return "restaurant";
	 }
	 
	 
	 @GetMapping("/gallery")
	 public String gallery() {
		 return "gallery";
	 }
	
	 
/*user */

	 @GetMapping("/admindetail")
		 public String admindetail(Model model) {
		 model.addAttribute("data", userService.getUsers());
			 return "admindetail";
		 }
	 
	 @GetMapping("/adminreg")
		public String adminreg(Model model){
			User user=new User();
			model.addAttribute("user", user);
			return "adminreg";
		}
	 
		@PostMapping("saveUser")
		public String saveUser(@ModelAttribute("user") User user) {
			userService.saveUser(user);
			return "redirect:/admin";
		}
		
		@GetMapping("/deleteUser/{id}")
		public String deleteUser(@PathVariable(value="id") long id) {
			userService.deleteUser(id);
			return "redirect:/admindetail";
		}
		
		/*
		 * @GetMapping("/updateForm/{id}") public String
		 * updateForm(@PathVariable(value="id") long id, Model model) { Optional <User>
		 * user= userService.getUserById(id); model.addAttribute("data", user); return
		 * "updateUser"; }
		 */
	 
		
		 
		
/* Mail sending */		
		@PostMapping("/sendMail")
		public String sendMail(@ModelAttribute Email email, HttpSession session) {
			
			emailService.sendMail(email);
			session.setAttribute("message", "Email Send successfully");
			/* System.out.println("sending mail to: "+ email.getTo()); */
			return "redirect:/";
		}
	 
}
