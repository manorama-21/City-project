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
public class homeController {
	/*
	 * @Autowired private AdminService adminService;
	 */

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
		/*
		 * @GetMapping("/updateForm") public String updateUser() { return "updateUser";
		 * }
		 */
		/*
		 * @GetMapping("/viewdetails") public String viewdetails() { return
		 * "viewdetails"; }
		 */
		/*
		 * @GetMapping("/admindetail") public String admindetail(Model model) {
		 * model.addAttribute("data", adminService.getUsers()); return "admindetail"; }
		 * 
		 * @PostMapping("login") public String saveUser(@ModelAttribute("admin") Admin
		 * admin) { adminService.saveUser(admin); return "admin"; }
		 * 
		 * @GetMapping("/deleteUser/{id}") public String
		 * deleteUser(@PathVariable(value="id") long id) { adminService.deleteUser(id);
		 * return "admindetail"; }
		 * 
		 * @GetMapping("/updateForm/{id}") public String
		 * updateadmindetail(@PathVariable(value="id") long id, Model model) { Optional
		 * <Admin> admin= adminService.getUserById(id); model.addAttribute("data",
		 * admin); return "updateadmindetail"; }
		 */
	 
}
