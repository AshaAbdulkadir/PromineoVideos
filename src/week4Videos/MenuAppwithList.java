package week4Videos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAppwithList {
	static Scanner scanner = new Scanner(System.in);
	static List<String> students = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		int choice = 0;
		
		while (choice !=4) {
			
			showMenu();
			
			choice = getUserChoice();
			if (choice == 1) {
				printStudentNames();
			} else if (choice == 2) {
				addNewStudent();
			} else if (choice == 3) {
				deleteStudent();
			} else if (choice == 4) {
				System.out.println("Good bye!");
			} else {
				System.out.println("Please select a valid option");
			}
		}	
		
	}
	
	public static void showMenu() {
		System.out.println("1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student at Position");
		System.out.println("4) Exit");
		System.out.println("-------------------------------");
	}
	
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	
	public static void printStudentNames() {
		for (String student : students) {
			System.out.println(student);
		}
	}
	
	public static void addNewStudent() {
		System.out.println("Enter the name you would like to add: ");
		String name = scanner.next();
		students.add(name);
		System.out.println("Student added: " + name);
	}
	
	public static void deleteStudent() {
		System.out.println("Enter the index of the student you wish to delete: ");
		int index = getUserChoice();
		students.remove(index);
		
	}	
	
}
