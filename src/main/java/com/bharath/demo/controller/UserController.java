package com.bharath.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.demo.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice ;

	@PostMapping("/validateUser")
	public boolean validateUser(String username,String password) {
		
		return userservice.validateUser(username,password);
	}
}
