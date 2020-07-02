package com.syntax.repl20_39;

import java.util.Scanner;

class Repl22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.next();

		String str = scanner.nextLine();

		System.out.println("Enter your mobile number");
		String phone = scanner.nextLine();

		System.out.println("Enter your age");
		int age = scanner.nextInt();

		System.out.printf("Your name is %s, your age is %d and your mobile number is %s", name, age, phone);
		scanner.close();
	}

}

//For you to do:
//Write a program to take user name, age and mobile number
//
//First Output: "Enter your name"
//Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
//Third Output: "Enter your age"
//
//Example Output: 
//Enter your name
//Enter your mobile number
//Enter your age
//Your name is Weqas, your age is 45 and your mobile number is 571-339-9999
