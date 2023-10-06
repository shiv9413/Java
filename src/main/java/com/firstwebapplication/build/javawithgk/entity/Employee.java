package com.firstwebapplication.build.javawithgk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	// id name email bloodgroup
	
	@Id
	@GeneratedValue()
	private int id;
	private String name;
	private String email;
	private String bloodgroup;
}
