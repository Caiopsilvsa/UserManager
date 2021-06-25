package com.projeto.UserManager.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.projeto.UserManager.Models.User;
import com.projeto.UserManager.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	public List <User> AllUsers() {
				
		return userRepository.findAll();
		
	}
	
	public User UserByid(Long id) {
		
		return userRepository.findById(id).get();
		
	}
	
      	
	public User createUser(User user) {
		
		return userRepository.save(user);
		
		
	}
	
	
	public String deleteUser(User user) {
       
				userRepository.delete(user);
				return "Usuario deletado";
		
		
	}		
}
	
	

