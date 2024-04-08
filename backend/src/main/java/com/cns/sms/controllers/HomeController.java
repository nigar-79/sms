package com.cns.sms.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

	@PreAuthorize("hasRole('NORMAL')")
	@GetMapping("/home")
	public String home() {
		return "Home Page";
		
	}
	
	@GetMapping("/login")
	@PreAuthorize("hasRole('NORMAL')")
	public String login() {
		return "Login Page";
		
	}
	
	@PreAuthorize("hasRole('NORMAL')")
	@GetMapping("/register")
	public String register() {
		return "Register Page";
	}
}
