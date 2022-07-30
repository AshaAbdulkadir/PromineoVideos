package week4Videos;

public class StringAndStringBuilder {

	public static void main(String[] args) {
		
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		//System.out.println(firstName.concat(lastName));
		// String is immuttable-creates a different string if reassigned 
		firstName = firstName.concat(lastName);
		System.out.println(firstName);
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
		
		//StringBuilder is mutable- allows us to build up and manipulate the path of that string
		//and convert the final product to string without the overhead of creating multiple new strings
		//use a string builder when you want to dinamically create a string and string when you have a constant or value set only once and not going to change
		
		//contracters
		System.out.println(fullName.charAt(5));
		//System.out.println(fullName.deleteCharAt(5));
		//System.out.println(fullName.delete(1, 3));
		
		System.out.println(fullName.indexOf("it"));
		System.out.println(fullName.replace(4, 9, "Thompson"));
		System.out.println(fullName.reverse());
	}
	
	/* public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
		result += str;
		}
 			return result;
     */

	public static String multiplyString(String str, int num) {
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < num; i++) {
				result.append(str);
			}
			return result.toString();
	}
}
