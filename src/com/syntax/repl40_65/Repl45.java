package com.syntax.repl40_65;

import java.util.Scanner;

public class Repl45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number between 1-7");

		try {

			int num = scanner.nextInt();
			String day = "null";

			switch (num) {
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4:
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			case 6:
				day = "Saturday";
				break;
			case 7:
				day = "Sunday";
				break;
			default:
				System.out.println("Invalid");
				break;
			}
			if (!day.equals("null")) {
				System.out.println(day);
			}
		} catch (Exception e) {
			System.out.println("Enter numbers only.");
		}

		scanner.close();
	}

}

//For you to do:
//Ask the user to enter any number from 1-7.
//Based on the number define the day of the week
//
//
//Example Output:
//Input a number between 1-7
//Friday
//
//Example Output:
//Input a number between 1-7
//Invalid