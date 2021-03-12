package com.sample.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.app.model.ApplicationModel;
import com.sample.app.service.ApplicationService;

@RestController
public class ApplicationController {
	
	@Autowired
	private ApplicationService service;
	
	@GetMapping("/user/{userName}")
	public ApplicationModel get(@PathVariable String userName) {
		return service.getUser(userName);
	}
	
	@PostMapping("/user")
	public ApplicationModel post(@RequestBody ApplicationModel user) {
		return service.saveUser(user);
	}
	
	@PutMapping("/user")
	public ApplicationModel put(@RequestBody ApplicationModel user) {
		return service.updateUser(user);
	}
	
	@DeleteMapping("user/{userName}")
	public ApplicationModel delete(@PathVariable String userName) {
		return service.deleteUser(userName);
	}
}
