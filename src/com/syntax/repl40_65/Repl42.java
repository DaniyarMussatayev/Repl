package com.syntax.repl40_65;

import java.util.Scanner;

public class Repl42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the roll number of the child");

		try {

			int rollNumber = scanner.nextInt();
			String name = "null";

			switch (rollNumber) {

			case 101:
				name = "Ramesh";
				break;
			case 102:
				name = "Mahesh";
				break;
			case 103:
				name = "Mukesh";
				break;
			default:
				System.out.println("Not found Student name: in Class");
				break;
			}

			if (!name.equals("null")) {
				System.out.printf("Student name: %s ", name);
			}
		} catch (Exception e) {
			System.out.println("Invalid input. Enter numbers only.");
		}

		scanner.close();

	}
}

//For you to do:
//Write a program using the switch statement  
//Let us consider there are three students in the class with roll number  starting from (101 to 103) if any number other than 101-103 are present display "Not found Student name: in Class"
//
//First Output: "enter the roll number of the Child"
//
//case 101: if roll number is 101 print as "Student name: Ramesh "
//
//case 102 :if roll number is 102 print as "Student name: Mahesh "
//
//case 103:if roll number is 103 print as "Student name: Mukesh "
//
//Other than this roll number  it should print "Not found Student name: in Class"