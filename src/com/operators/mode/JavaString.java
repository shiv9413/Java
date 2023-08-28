package com.operators.mode;

public class JavaString {
	public static void main(String args[]) {
		System.out.println("Now i am staring Java String");
		
		String first_name = "Gagan";
		String middle_name = "Deep";
		String last_name = "Kashyap";
		
		System.out.println("First name is : "+first_name+", Middle name is : "+middle_name+", last name is : "+last_name);
		
		System.out.println("The String length of first name is : "+first_name.length());
		
		System.out.println("first name converted into  upper case like : "+first_name.toUpperCase());
		System.out.println("last name converted into lower case like : "+last_name.toLowerCase());
		
		String text = "Hello this is an dummy text in which i try to search word using indexOf method";
		
		System.out.println("search located in string in "+text.indexOf("search"));
		
		System.out.println("i am using concat function instaed of + keyword for combine string with variable "+first_name.concat(middle_name));
	}
}
