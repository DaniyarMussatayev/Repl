package com.syntax.repl120_141;

public class Repl137 {
	public String name = "John";
	protected String city = "Miami";
	String nameOfSchool = "Syntax";
	private int batchNumber = 6;

	void display() {
		System.out.println("My name is " + name + " and I live in " + city + "." + " I study at " + nameOfSchool
				+ " in batch " + batchNumber);
	}

	public static void main(String[] args) {
		Repl137 obj = new Repl137();
		obj.display();
	}

}

//For you to do 
//In main class please declared the variables using different access modifiers that will hold value for:
//name
//city
//name of the school
//batch number
//
//Create a method to display details in following format:
//My name is ___ and I live in ___. I study at ___ in batch ___
//
//Assign values to the variables and execute method display
//
//Expected Output:
//My name is John and I live in Miami. I study at Syntax in batch 6