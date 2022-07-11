package week3Videos;

public class Arrays {

	public static void main(String[] args) {
		
		String studentName1 = "Tom";
		String studentName2 = "Jack";
		String studentName3 = "Bill";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		String[] students = new String[3];
		
		students[0] = "Tom";
		students[1] = "Jack";
		students[2] = "Bill";
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		//instead of printing multi println use a for loop
		
		for (int i= 0; i< students.length; i++) {
			System.out.println(students[i]);
		}
		//enhanced for loop new variable studentList
		System.out.println("Enhanced for loop: ");
		
		for (String studentList : students) {
			System.out.println(studentList);
		}

	}

}
