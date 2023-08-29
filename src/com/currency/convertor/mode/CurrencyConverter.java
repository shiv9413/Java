package com.currency.convertor.mode;
import java.util.Scanner;

/*
 * CurrencyConverter
*/

public class CurrencyConverter {
    public static void main(String Argument[]) {
    	System.out.println("1 Ruppe");
    	System.out.println("2 Dollar");
    	System.out.println("3 Euro");
    	
    	//take input
    	Scanner sc = new Scanner(System.in);
    	//take currency as input
    	System.out.println("Choose the currency");
    	
    	int choice = sc.nextInt();
    	System.out.println("Enter the amount");
    	double amount = sc.nextDouble();
    	
    	//Convert the amount
    	
    	switch(choice) {
    		case 1:
    			Ruppe_to_other(amount);
    		    break;
    		case 2:
    			//Dollar_to_other(amount);
    			break;
    		case 3:
    			//Euro_to_other(amount);
    			break;
    		default:
    			System.out.println("Invalid Choice you entered");
    	}
    }
    public static void Ruppe_to_other(double amt) {
	    System.out.println("1 Ruppe = " + 0.012 + " Dollar");
	    System.out.println();

	    System.out.println(amt+" Ruppe = " + (amt*0.012) + " Dollar");
	    System.out.println();

	    System.out.println("1 Ruppe = " + 0.011 + " Euro");
	    System.out.println();
	    System.out.println(amt+" Ruppe = " + (amt*0.011) + " Euro");
	    System.out.println();

	}
}
