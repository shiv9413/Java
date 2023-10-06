package com.firstwebapplication.build.javawithgk.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/employees/{id}")
	getEmployeeDetails(@PathVariable("id") int id){
		// Database Call
		
	}
}
