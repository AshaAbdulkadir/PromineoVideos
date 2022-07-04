package week2Videos;

public class Conditionals {

	public static void main(String[] args) {
		//if statement
		String name = "Sam"; // if name is different nothing prints out
		
		if (name == "Sam") {
			System.out.println("Hello Sam!");
		}
		
		// else statement comes right after the closing curly brace of an if statement
		// used if the condition of if statement is false otherwise its not executed

		else {
			System.out.println("You are not sam, " + name); // if not Sam prints out
		}
		
		int age = 15; // if changed to a number greater  or equal to 16 it prints out the if statement
		
		if (age >= 16) {
			System.out.println("You can get your license");
		} else {
			//System.out.println("Please wait until you are 16 years old.");
			
			System.out.println("Please wait " + (16 - age) + " year(s) to get your lisence."); // to help know how many years before one could get a lisence
			
		}
		
		double costOfMilk = 4; //if price changes the right statement is executed 
		
		if (costOfMilk <=2) {
			//runs if it's true
			System.out.println("Buying 2");
		} else if (costOfMilk <= 3) {
			//runs if the preceding if statement is false
			System.out.println("Buying 1");
		}else {
			//otherwise runs if all preceding statements are false 
			//used as a single default statement at the end of if and all if else statement are false
			System.out.println("Not buying any milk.");
		}
		
		// switch use to evaluate variables and executes base on values of variable
		
		char grade ='A'; // when grade changes the value that is evaluated in the case prints out
		
		switch (grade) {
		  case 'A':
			  System.out.println("90%");
			  break; //stops the code - prevents cascading
		  case 'B':
			  System.out.println("80%");
			  break;
		  case 'C':
			  System.out.println("70%");
			  break;
		  default:
			  System.out.println("0%");
			  
		}
		
		//having multiple conditions together
		if (5 == 5) {
			if (4 == 4) {
				System.out.println("Yes");
			}
		}
		// or flatten the whole thing
		
		if (5 == 5 && 4 == 4) {
			System.out.println("Yes");
		}
		
		//okay to have nested if statement is if the nested if has multiple paths that can occur other it can be flattened 
		if (5 == 5) {
			//nested if statement
			if (4 == 3) {
				System.out.println("5 is 5 and 4 is 4");
			} 
			//divergent path
			//for this path to occur the if statement must be true
			else {
				System.out.println("5 is 5");
			}
		}
		
	
		
		
		
		
	}

}
