package com.syntax.repl66_88;

public class Repl68 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 6; j++) {
				if (((i == 1 || i == 4) && (j == 5 || j == 6)) || ((i == 2 || i == 3) && (j >= 2 && j <= 5))) {
					System.out.print(" ");
				} else {
					System.out.print("$");
				}

			}
			System.out.println();
		}

	}
}

//For you to do: 
//Write a program to print out the pattern: 
//
// Expected output:
//$$$$
//$  $
//$  $
//$$$$
