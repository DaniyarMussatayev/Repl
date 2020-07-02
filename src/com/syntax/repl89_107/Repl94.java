package com.syntax.repl89_107;

public class Repl94 {
	public static void main(String[] args) {
		String str = "I love Java classes at Syntax";

		int index1 = str.indexOf("classes");

		System.out.println(str.substring(index1));
		System.out.println(str.substring(0, index1 - 1));

	}

}

//For you to do:
//
//Create a String given="I love Java classes at Syntax"
//Retrieve 2 Strings from given String and print them 
//
//Expected Output:
//classes at Syntax
//I love Java