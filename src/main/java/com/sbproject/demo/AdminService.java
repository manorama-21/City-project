package com.sbproject.demo;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	public void saveUser(Admin admin) {
		adminRepository.save(admin);
	}
	
	public List<Admin> getUsers(){
		return adminRepository.findAll();
	}
	
	
	  public Optional<Admin> getUserById(Long id){
		  return adminRepository.findById(id); 
		  }
	  
	 public void deleteUser(Long id) {
		 adminRepository.deleteById(id);
		 }
	
	
}
