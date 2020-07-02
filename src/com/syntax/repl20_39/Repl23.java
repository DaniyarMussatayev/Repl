package com.syntax.repl20_39;

import java.util.Scanner;

public class Repl23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the boolean value");
		boolean answer = scanner.nextBoolean();

		if (answer) {
			System.out.println("The value is true");
		} else {
			System.out.println("The value is false");
		}
		scanner.close();

	}

}

//For you to do:
//Create a program that will ask a user to input boolean value "Input the boolean value"
//If the input is true or false, then the output should look like below: 
//
//Example Output: 
//Input the boolean value
//The value is true
//
//Example Output: 
//Input the boolean value
//The value is false
