package com.syntax.repl40_65;

import java.util.Scanner;

public class Repl65 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int x;
		System.out.print("In:");
		x = inp.nextInt();

		for (int a = (x - 1); a >= 0; a--) {
			System.out.print(a + " ");
		}

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
