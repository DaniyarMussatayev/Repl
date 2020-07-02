package com.syntax.repl20_39;

import java.util.Scanner;

public class Repl24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, please enter your name");
		String name = scanner.next();
		System.out.printf("Your name is %s", name);
		scanner.close();
	}

}

//For you to do:
//Write a program that takes a user's name and prints it. 
//
//Example Output:
//Hello, please enter your name
//Your name is Sumair
