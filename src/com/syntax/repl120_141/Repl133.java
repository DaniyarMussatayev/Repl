package com.syntax.repl120_141;

public class Repl133 {
	static String countA(String s) {
		String total = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			total = total + s.charAt(i);
			if (total.equalsIgnoreCase("a")) {
				for (int j=0;j<total.length();j++) {
					System.out.println(j);
				}
			}
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(countA("aaA")); // 3
		System.out.println(countA("aaBBdf8k3AAadnklA")); // 6

	}
}

//Create a static method with the following specs:  
//
//Returns:
//an integer
//Name:
//countA
//Parameters:
//a String called s
//Purpose:
//count the number of occurrences of 'a' or 'A' within s
//
//Examples:
//countA("aaa") ==> 3
//countA("aaBBdf8k3AAadnklA") ==> 6
//Hint: How do you write a for loop to loop through every letter of a string?  You've done this multiple times already :)