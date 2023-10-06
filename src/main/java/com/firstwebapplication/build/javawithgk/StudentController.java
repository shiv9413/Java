package com.firstwebapplication.build.javawithgk;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@RequestMapping("/student")
	public List<StudentData> retrieveAllCourses(){
		return Arrays.asList(
				new StudentData("Student-001","Gagan","Deep","Kashyap","7068386581","Mohali"),
				new StudentData("Student-002","Neeraj","","Kumar","9632587410","Panchkula"),
				new StudentData("Student-003","Hemant","B","Yadav","741258963","Haryana")
				);
	}
}
