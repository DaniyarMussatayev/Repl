package com.syntax.repl89_107;

import java.util.Scanner;

public class Repl100 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String s = inp.nextLine();
		// write your code below

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		inp.close();

	}
}

//Given the following inputs:
//String s;
//
//Write a for loop that will print out the reverse of the string.
//
//Sample input/outputs:
//In: manhattan
//nattahnam
//
//In: processor
//rossecorp
//
//In: racecar
//racecar
