package com.sbproject.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void saveUser(User user) {
		userRepository.save(user);
		
	}
	
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	public Optional<User> getUserById(Long id){
		return userRepository.findById(id);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
}
