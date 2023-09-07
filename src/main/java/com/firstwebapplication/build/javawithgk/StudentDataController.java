package com.firstwebapplication.build.javawithgk;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDataController {
	public List<StudentData> reteriveAllData(){
		return Arrays.asList(
					new StudentData(1,"Gagan","Deep","Kashyap","9876")
				);
	}
}
