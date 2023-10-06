package com.firstwebapplication.build.javawithgk;

public class StudentData {
	private String student_id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String contact_number;
	private String location;
	
	public StudentData(String student_id, String first_name, String middle_name, String last_name, String contact_number,
			String location) {
		super();
		this.student_id = student_id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.contact_number = contact_number;
		this.location = location;
	}
	
	
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "StudentData [student_id=" + student_id + ", first_name=" + first_name + ", middle_name=" + middle_name
				+ ", last_name=" + last_name + ", contact_number=" + contact_number + ", location=" + location + "]";
	}
}
