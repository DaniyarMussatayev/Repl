package com.syntax.repl89_107;

import java.util.Scanner;

public class Repl96 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any programming language");
		String language = sc.nextLine();

		language = language.toLowerCase();
		switch (language) {
		case "java":
			System.out.println("Java is a programming language");
			break;
		case "c":
			System.out.println("C is a procedural programming language");
			break;
		case "c++":
			System.out.println("C++ is a middle-level programming language");
			break;
		default:
			System.out.println("Doesn't match any programming language");
		}

		sc.close();
	}

}

//For you to do:
//
//You have Scanner class to input string value. 
//
//If language is Java it should print the: 
//"Java is a programming language".
//
//If language is C it should print the:
//"C is a procedural programming language"
//
//If language is C++ it should print the:
//"C++ is a middle-level programming language"
//
//If any other should print:
//"Doesn't match any programming language"
