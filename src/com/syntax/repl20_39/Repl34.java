package com.syntax.repl20_39;

import java.util.Scanner;

public class Repl34 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");

		int[] array = new int[3];

		for (int i = 0; i < array.length; i++) {
			int num = scanner.nextInt();
			array[i] = num;
		}
		int maxNum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (maxNum < array[i]) {
				maxNum = array[i];
			}
		}
		System.out.printf("The largest number is %d", maxNum);
		scanner.close();
	}

}

//Write a program to find the largest number among three distinct numbers using nested if condition
//Please use Scanner class to take input from users
//
//Expected Output:
//Please enter 3 distinct numbers
//The largest number is 14
