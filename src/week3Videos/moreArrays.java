package week3Videos;

public class moreArrays {

	public static void main(String[] args) {
		String[] products = new String [5];
		
		products[0] = "Carrots";
		products[1] = "Pinapples";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		//each product in products - string variable 
		for (String product : products) {
			System.out.println("Products: " + product);
		}
		
		int [] multiplesOf3 = new int[10];
		
		for (int i = 1; i<= multiplesOf3.length; i++) {
			multiplesOf3 [i-1] =i * 3;
			System.out.println("number: " + multiplesOf3[i-1]);
		}
		int[] multiplesOf5 = new int[10];
		
		for (int i =0; i< multiplesOf5.length; i++) {
			multiplesOf5[i] = i * 5;
			System.out.println(multiplesOf5[i]);
		}
		
	}

}
