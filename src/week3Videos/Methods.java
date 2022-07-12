package week3Videos;

public class Methods {

	public static void main(String[] args) {
		String firstName = "Bob";
		String lastName = "Ross";
		
		//method that takes two strings and concatenate
		//createFullName- call a method i.e name and parenthesis() which holds an argument 
		
		String fullName = createFullName (firstName, lastName);
		String fullName2 =createFullName ("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);

	}
	// methods do not do anything- they are instructions that's why it has to be called like in above or invoked 
	//method signature, includes:
	//public static- for all methods for now
	//String- return type string / void -to return nothing 
	// createFullName- name of variable- meaningful-verb
	// parenthesis- can be blank or have parameters- separated by a comma has to math the type
	
	//return key
	public static String createFullName (String x, String y) {
		return x + " " + y;
	}

}
