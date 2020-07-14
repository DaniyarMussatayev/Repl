package com.syntax.repl120_141;

public class Repl129 {
public static void main(String[] args) {
		
		countryName="Morocco";
		continent="Africa";
		display();
	}
	static String countryName, continent;
	
	static void display() {
		System.out.println(countryName+ " located on " +continent + " continent");
	}
	

}

//For you to do:
//
//Declare two static variables to hold
//country name
//continent
//
//Create a method to display the value of static variables in the following format:
// 
//____ located on ____ continent
//
//In the main method assign values to a static variable and execute method display
//
//Expected Output:
//Morocco located on Africa continent
