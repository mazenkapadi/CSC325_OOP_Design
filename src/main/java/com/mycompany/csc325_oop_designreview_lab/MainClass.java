package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * MainClass represents the main entry point for the student information program.
 * It allows users to input and manage student data.
 *
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {
		// Create instances of students

		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of Student class

		// Todo 7: Create two classes for Freshman and Senior

		// ToDo 8: The senior class should have a minimum of 85 credits

		Student std1 = new Student("James", (short) 20);

		// ToDo 11: Add a toString method for the Senior class

		Student std2 = new Freshman("James", (short) 20, 12); // name, age, credits

		Student std3 = new Senior("John", (short) 30, 90);

		// Get student GPA and address information

		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		Scanner sc = new Scanner(System.in);

		askAddressGPA(std2, sc);

		askAddressGPA(std3, sc);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

		// Print student information

		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);

		// ToDo 13: add comments and explain your code

		// ToDo 14: submit using a pull request.
	}

	private static void askAddressGPA(Student std2, Scanner sc) {
		System.out.println("What is your gpa?");
		double gpa = sc.nextDouble();
		sc.nextLine(); // Consume newline
		std2.setGpa(gpa);

		System.out.println("What is your address?");
		String address = sc.nextLine();
		std2.setAddress(address);
	}
}