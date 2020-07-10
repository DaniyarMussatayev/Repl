package com.syntax.repl108_119;

public class Repl119 {
	public static String censorLetter(String a, char b) {
		String newString = a.replace(b, '*');
		return newString;
	}
	public static void main(String[] args) {
		System.out.println(censorLetter("computer science", 'e'));
		System.out.println(censorLetter("trick or treat", 't'));
	}
}

//Returns:
//a String
//Name:
//censorLetter
//Parameters:
//a String
//a char
//
//Then complete the method by programming the following behavior
//Replace all instances of given character with a "*" within the given String.
//See below examples.
//
//Examples:
//censorLetter("computer science",'e') ==> "comput*r sci*nc*"
//censorLetter("trick or treat",'t') ==> "*rick or *rea*"