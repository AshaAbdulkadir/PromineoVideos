package week2Videos;

public class Loops {

	public static void main(String[] args) {
	//performs actions over and over again- loops allow repeat until a condition is met
		//for loops for if you know how many time you want to iterate - know numbers 
		// ++ increment by 1
		for (int i = 0; i < 10; i++) {
			//System.out.println("Scoop cup of flour"); -  prints 10 times
			
			System.out.println(i); //prints numbers out to 9 
			
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 0; i < 100; i += 2) {
			// increment by 2
			System.out.println(i);
		}
		//logically reduce
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0)
				//any number divided by 0 is even- using a module 
			System.out.println(i);
		}
		
		int x = 0;
		while(x< 10) {
		//System.out.println(x); -creates an infinite loop and crushes the program/code
			System.out.println(x); 
			x++; // change x - a way to exit/ condition has a default
		}
		
		//iterates at least once -checks a condition at the end unlike a while loop that checks at the start
		// possible for it to never execute even once
		
		do  { 
			System.out.println(x);
			x++;
		} while (x<2);
		
		
		
		
		
		
		
		
		
		
	}

}
