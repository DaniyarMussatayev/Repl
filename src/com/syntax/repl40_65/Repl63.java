package com.syntax.repl40_65;

import java.util.Scanner;

public class Repl63 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");

		try {
			int x = inp.nextInt();

			for (int i = 0; i < x; i++) {
				System.out.print(i + " ");
			}
		} catch (Exception e) {
			System.err.println("Invalid input. Enter number only!");
		}

		inp.close();
	}
}

//Given the following inputs:
//int x;
//
//Write a for loop that will print out a series of numbers starting at 0 and ending at the x(value must be taken from a user), exclusive.
//
//Example Output:
//In: 3
//0 1 2
//
//In: 8
//0 1 2 3 4 5 6 7
//
//In: 5
//0 1 2 3 4
