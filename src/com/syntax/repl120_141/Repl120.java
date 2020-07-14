package com.syntax.repl120_141;

public class Repl120 {
	public static void main(String[] args) {
		Repl120 obj =new  Repl120();
		obj.schoolName="Syntax";
		obj.year=2020;
		obj.batch=6;
		System.out.println("I am a student of batch " + obj.batch + " studying at " + obj.schoolName + " in the year of " + obj.year);
	}
	String schoolName;
	int year, batch;

	
}

//For you to do:
//
//Declare 3 instance variables to hold: 
//
//year, school name and batch #
//
//Access variables from the main method and assign specific values to them
//Print values of your variables in the following format:
//
//Expected Output:
//I am a student of batch 6 studying at Syntax in the year of 2020
