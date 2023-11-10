package com.firstwebapplication.build.javawithgk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstwebapplication.build.javawithgk.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}
