package com.Hospital_Management_System.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital_Management_System.model.LoginRequest;

@CrossOrigin(origins="http://localhost:4200")

@RestController


public class UserController{

	@PostMapping("/")
	 public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
		
		System.out.println("In login");
	        // Authenticate user (This is a simplified example)
	        if ("mana".equals(loginRequest.getUserName()) && "mana".equals(loginRequest.getPassword())) {
	        	
	        	
	            return ResponseEntity.ok().body("{\"message\": \"Login successful\"}");
	        } else {
	            return ResponseEntity.badRequest().body("{\"message\": \"Invalid credentials\"}");
	        }
	    }

}
