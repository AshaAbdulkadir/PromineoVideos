package week4Videos;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		String [] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		//List<E> list of E where E is the generic that will be replaced with the type
		//List<String> reads as 'list of String'
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		
		//removes an index
		sports.remove(1);
		
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		
		for(String sport :sports) {
			System.out.println(sport);
		}
		
		//we can not use prmitive data type in list because it has to be a class/object 
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println(numbers);
		
		
		
		
		

	}

}
