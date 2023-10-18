package com.firstwebapplication.build.javawithgk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstwebapplication.build.javawithgk.entity.Employee;
import com.firstwebapplication.build.javawithgk.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo EmployeeRepo;
	public Employee getEmployeeById(int id) {
		Employee employee = EmployeeRepo.findById(id).get();
		return employee;
	}
}
