package com.syntax.repl120_141;

public class Repl125 {
static int number;
	
	public static void main(String[] args) {
		
		number=100;
		
		Repl125 mm=new Repl125();
		mm.number=200;
		
		System.out.println(mm.number);
		System.out.println(number);
		
	}

}

//For you to do:

//Declare a static variable number that will hold an integer value:
//
//Access number from the main method and assign value to it.
//Create an Object of the class, access number in a nonstatic way and assing value of 200.
//
//Print out number using class name and using instance
//
//Expected Output:
//200
//200
