package com.syntax.repl152_170;

public class Repl153 {
	public Repl153() {
		System.out.println("This is Parent constructor");
	}
}

class Chiild extends Repl153{
	public Chiild() {
		super();
	}
}

class Maain{
	public static void main(String[] args) {
		Chiild c =new Chiild();
		
	}
}

//In parent class
//Create a non argument constructor and write a logic to print "This is Parent constructor"
//
//Create a Child Class that will be subclass of the Parent class.
//Create a constructor without parameter and call parent class constructor expicitly
//
//In Main Class. 
//Create and object of Child class and run the application. 
//
//Expected Output:
//This is Parent constructor
