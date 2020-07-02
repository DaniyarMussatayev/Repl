package com.syntax.repl40_65;

import java.util.Scanner;

public class Repl41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the age of the child");

		try {

			int age = scanner.nextInt();
			String result = null;

			switch (age) {
			case 1:
				result = "Crawl";
				break;
			case 2:
				result = "Talk";
				break;
			case 3:
				result = "Dance";
				break;
			case 4:
				result = "get Trouble";
				break;
			default:
				System.out.println("I don't know how old you are");
				break;
			}
			if (result != null) {
				System.out.printf("You can %s", result);
			}
		}

		catch (Exception e) {
			System.out.println("Invalid input. Enter whole numbers only.");
		}

		scanner.close();
	}

}

//For you to do:
//Write a program using the switch statement  
//Let us consider the scenario regarding the born baby age 
//
//First Output: "enter the age of the Child"
//
//case 1: if age is 1 print as "You can Crawl"
//
//case 2 : if age is 2 print as  "You can Talk"
//
//case 3: If age is 3 print as "You can Dance"
//
//case 4: if age is 4 print as "You can get  Trouble"
//
//Other than this age (1-4) it should print "I don't know how old you are" 


