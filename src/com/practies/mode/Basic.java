package com.practies.mode;

public class Basic {
	public static void main(String args[]) {
		// println method will add new line at the end of output
		System.out.println("Hello this is our first line");
		System.out.println("Hello this is our second line");
		System.out.println("Hello this is our third line");
		System.out.println("Hello this is our forth line");
		
		// Without add double quotes can print numbers
		System.out.println(2);
		System.out.println(2+2+2+2+2);
		var a = 10; var b = 20;
		System.out.println(a+b);
		
		//Print method will not add new line at the end of output
		System.out.print("Hello this is fivth line of code");
		System.out.print("Hello this is sixth line of code");
		System.out.print("Hello this is sevth line of code");
		System.out.println(3+3+3+3+3);
		
		/* Next Topic Start With Java Variables */
		
		System.out.println("First we will discuss String Type Variables");
		
		String firstname = "Gagan";
		String middlename = "Deep";
		String lastname = "Kashyap";
		
		System.out.println("First Name is "+firstname+" Middle Name is "+middlename+" Last Name is "+lastname);
		
		int digit_1 = 10;
		int digit_2 = 20;
		int sum = digit_1 + digit_2;
		int sub = digit_1 - digit_2;
		int multi = digit_1 * digit_2;
		
		System.out.println("The Addtion of digit_1 "+digit_1+" and digit_2 "+digit_2+" is = "+sum);
		System.out.println("The Subtraction of digit_1 "+digit_1+" and digit_2 "+digit_2+" is = "+sub);
		System.out.println("The Multiplication of digit_2 "+digit_1+" and digit_2 "+digit_2+" is = "+multi);
		
		float myfloatnumber = 10.3f;
		
		System.out.println("Float number is "+myfloatnumber);
		
		char word = 'D';
		
		System.out.println("Character number is "+word);
	}
}
