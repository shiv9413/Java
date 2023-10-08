package com.firstwebapplication.build.javawithgk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.firstwebapplication.build.javawithgk.entity.Employee;
import com.firstwebapplication.build.javawithgk.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	Employee getEmployeeDetails(@PathVariable("id") int id){
		// db call -> employee 1		
		Employee employee = employeeService.getEmployeeById(id);
		return employee;
	}
}
