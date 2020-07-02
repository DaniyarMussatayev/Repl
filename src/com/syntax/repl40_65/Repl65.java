package com.syntax.repl40_65;

import java.util.Scanner;

public class Repl65 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");

		try {

			int x = inp.nextInt();
			if (x > 0) {
				for (int i = x - 1; i >= 0; i--) {
					System.out.printf("%d ", i);
				}
			} else {
				for (int i = x - 1; i <= 0; i++) {
					System.out.printf("%d ", i);
				}

			}

		} catch (Exception e) {
			System.err.println("Invalid input. Enter numbers only!");
		}
		inp.close();
	}
}

//Given the following inputs:
//int x;
//
//Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
//
//Sample input/outputs:
//In: 7
//6 5 4 3 2 1 0
//
//In: 12
//11 10 9 8 7 6 5 4 3 2 1 0
//
//In: 20
//19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
