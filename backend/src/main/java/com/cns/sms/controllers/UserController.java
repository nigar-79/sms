package com.cns.sms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cns.sms.models.User;
import com.cns.sms.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	//all users
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/")
	public List<User> getAllUsers() {
		return this.userService.getAllUsers(); 
	}
	
	//single user
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}
	
	@PostMapping("/")
	@PreAuthorize("hasRole('ADMIN')")
	public User add(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
}
