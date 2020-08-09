package com.syntax.repl178_194;

import java.util.ArrayList;

public class ListRepl192 {
	public static boolean ifPrime(int num) {
		if (num == 2) {
			return true;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}

			}
		}
		return true;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 2; i <= 100; i++) {
			if (ifPrime(i)) {
				list.add(i);
			}
		}
		System.out.println(list);
	}

}
//
//Create an Linked List that will store all prime numbers from 1 to 100
//
//Step 1. Create a method that will identify wether number is prime or not
//Step 2. Add all prime numbers into Linked List
//
//Print Linked List:
//
//Expected Output:
//[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
