package com.projeto.UserManager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {

	
	@GetMapping("/olamundo")
	public String olaMundo() {
		
		return "Ola Mundo";
		
	}
	
	
	
	
}
