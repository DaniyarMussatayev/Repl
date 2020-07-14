package com.syntax.repl120_141;

import javax.jws.soap.SOAPBinding;

public class Repl121 {
	int num;
	double num2;
	char letter;

	public static void main(String[] args) {
		Repl121 obj = new Repl121();
		obj.num=10;
		obj.num2=10.23;
		obj.letter='a';
		System.out.println(obj.num);
		System.out.println(obj.num2);
		System.out.println(obj.letter);
		
		Repl121 obj2 = new Repl121();
		obj2.num=100;
		obj2.num2=100.23;
		obj2.letter='s';
		System.out.println(obj2.num);
		System.out.println(obj2.num2);
		System.out.println(obj2.letter);
	}

}

//For you to do:
//declare 3 instance variables to hold an integer, double and char values.
//
//Create 2 instances of the class and assign values to variables and the print them
//
//Expected Output:
//10
//10.23
//a
//100
//100.23
//s
