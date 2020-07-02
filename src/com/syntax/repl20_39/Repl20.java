package com.syntax.repl20_39;

import java.util.Scanner;

class Repl20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter First Name");
		String name = scanner.next();
		System.out.println("Please Enter Surname");
		String surname = scanner.next();
		System.out.println(name + " " + surname);
		scanner.close();

	}

}

//For you to do: 
//Write  a program that takes user's first name and surname and prints in console
//Instruct the user to enter first name: "Please Enter First Name"
//Capture the first name
//Instruct the user to enter surname:"Please Enter Surname" 
//Capture surname
//Print first name and surname
//
//Final Output: 
//Example: 
//Please Enter First Name
//Please Enter Surname
//Cindy Crawford
