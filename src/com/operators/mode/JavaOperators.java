package com.operators.mode;
import java.util.Scanner;

public class JavaOperators {
	public static void main(String args[]) {
		System.out.println("Which Operation you want to perform");
		System.out.println("1 for Arthmetic operations");
		System.out.println("2 for Assignment Operations");
		System.out.println("3 for Bitwise Operations");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Choice");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		   case 1:
			   callArthmeticFunction();
			   break;
		   case 2:
			   callAssignmentFunction();
			   break;
		   case 3:
			   callBitwiseFunction();
			   break;
		   default:
				System.out.println("Invalid Input entered by You");
		}
	}
	
	public static void callArthmeticFunction(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int first = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int second = sc.nextInt();
		
		System.out.println("Select 1 For Addition");
		System.out.println("Select 2 For Subtraction");
		System.out.println("Select 3 For Multiplication");
		System.out.println("Select 4 For Divide");
		
		System.out.println("Choice one for Arthmetic Operation");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				int add = first + second;
				System.out.print("Addition of Two Numbers is "+add);
				break;
			case 2:	
				int sub = first - second;
				System.out.print("Subtraction of Two Numbers is "+sub);
				break;
			case 3:	
				int multi = first * second;
				System.out.print("Multiplication of Two Numbers is "+multi);
				break;
			case 4:	
				int divide = first / second;
				System.out.print("Divide of Two Numbers is "+divide);
				break;
			default:
				System.out.println("Invalid input entered by You");
		}
		
	}
	
	public static void callAssignmentFunction(){
		System.out.println("Enter a value of a");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Original value of a is "+a);
		a+=3;
		System.out.println("after increament value by 3 then value of a "+a);
		a-=4;
		System.out.println("after increment then descrease by 4 then value of a "+a);
		a*=5;
		System.out.println("after decrease then multi by 5 then value of a "+a);
		a/=8;
		System.out.println("after multi then divide by 8 then value of a "+a);
	}
	
	public static void callBitwiseFunction(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Operante");
		int first = sc.nextInt();
		
		System.out.println("Enter Second Operante");
		int second = sc.nextInt();
		
		System.out.println("When we perform Bitwise AND & "+(first & second));
		System.out.println("When we perform Bitwise exclusive OR ^ "+(first ^ second));
		System.out.println("When we perform Bitwise inclusive OR | "+(first | second));
		System.out.println("When we perform Bitwise Compliment ~ "+(~second));
		System.out.println("When we perform Bitwise left shift	<< "+(first << second));
		System.out.println("When we perform Bitwise right shift	>> "+(first >> second));
	}
}
