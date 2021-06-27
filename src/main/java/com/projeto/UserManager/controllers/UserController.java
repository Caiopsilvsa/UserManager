package com.projeto.UserManager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.projeto.UserManager.Models.User;
import com.projeto.UserManager.Services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User>AllUsers(){
		
		List<User> answer = userService.AllUsers();
		return answer;
			
		
	}

	
	
	
	@GetMapping("user/{id}")
	public User UserById(@PathVariable("id")Long id){
	   
		  User answer = userService.UserByid(id);
		  return answer;
	
		
		
	}
	
	@PostMapping
	public User CreateUser(@RequestBody User user) {
		
		 User answer = userService.createUser(user);
		 return answer;
		
	}
	
     
	public String DeleteUser(@RequestBody User user) {
	
       return  userService.deleteUser(user);
        
		
  }
}