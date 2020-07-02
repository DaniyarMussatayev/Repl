package com.syntax.repl89_107;

import java.util.Scanner;

public class Repl95 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		System.out.printf("The first 3 letters of %s is %s", word, word.substring(0, 3));
		scan.close();
	}

}

//For you to do:
//
//Using Scanner class input string value. 
//Print out the following: "The first 3 letters of ___ is ___"
//
//For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
