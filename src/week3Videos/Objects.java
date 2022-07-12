package week3Videos;

import java.util.Scanner;

public class Objects {

	public static void main(String[] args) {
		int age = 30;
		String name ="Asha Mae";
		
		//length is a method in string and has () while it is without () in Array it is properties 
		//primitive data types like int do not have properties or methods but objects do
		//can be found in java docs
		//objects are capitalized
		
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		
		//new keyword used for array or scanner to create a new instance of the objects 
		Scanner s = new Scanner(System.in);
		
		int[] numbers = new int[3];
		System.out.println(numbers.length);
		
	}

}
