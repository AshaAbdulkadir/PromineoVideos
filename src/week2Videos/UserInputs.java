package week2Videos;

import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
		//how to get user input from the console 
		//hover scanner and click import to get utility
		
		Scanner sc = new Scanner(System.in);
		//System.out.print("Hello"); // remove ln from println to put on same line
		//System.out.print("World");
		
		System.out.print("Enter your name: "); // println without ln to have it on same line
		String name = sc.nextLine(); // lets you enter name in console and appears in green 
		
		
		System.out.println("Welcome, "+ name );
		
		int selection = 0;
		double total = 0;
		
		// wrap inside a loop with not equal to !=/ this will continue loop until user checks out 
		while (selection !=4) {
		System.out.println("Select an option.");
		System.out.println("1) add candy bar to shopping cart: 1.99");
		System.out.println("2) add cheese to shopping cart: 6.95");
		System.out.println("3) add soccer ball to shopping cart: 12.99");
		System.out.println("4) Check out");
		
		selection = sc.nextInt();
		
		
		switch (selection) {
		  case 1:
			total += 1.99;
			break;
		  case 2: 
			total += 6.95;
		    break;
		  case 3:
			total += 12.99;
			break;
		  case 4:
			  break;
		  default:
			  System.out.println("Please pick a valid option.");
			  	  		  
		}
		
		System.out.println("Your current total is : "+ total);
	  }
	}

}
