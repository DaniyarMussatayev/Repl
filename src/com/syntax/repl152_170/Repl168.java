package com.syntax.repl152_170;

public class Repl168 {
	public static final String print(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(print("hello"));
	}
}

//For you to do:
//
//Create an instance final method that will reverse a String and return that new String
//
//Call method from the main method
//
//Expected Output:
//olleh
