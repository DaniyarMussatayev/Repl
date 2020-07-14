package com.syntax.repl120_141;

public class Repl130 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		mystery(a);
		// should print out 10 1 30 2 50
	}

	public static void mystery(int[] array) {
		for (int num:array) {
			if(num%2==0) {
				System.out.print(num/2+" ");	
			}else {
				System.out.print(num*10+" ");
			}
		}
	}

}

//For you to do:
//
//Complete the mystery method so that it takes in an integer array as a parameter, and then modifies each element based on whether it's even or odd. 
// If the number is even, divide it by 2.  If it's odd, multiply it by 10.
//
//Expected Output:
//10 1 30 2 50 
