package com.syntax.repl66_88;

public class Repl87 {
	public static void main(String[] args) {
		
		ForRepl87 obj1 = new ForRepl87();
		
		obj1.color = "Black";
		obj1.year = 2019;
		obj1.make = "BMW";
		
		ForRepl87 obj2 = new ForRepl87();
		
		obj2.color = "White";
		obj2.year = 2018;
		obj2.make = "Toyota";
		
		obj1.print();
		obj2.print();
	}

}

//For you to do:
//
//Create a class named 'Main' with specific attributes.
//Create two objects of that class in which you will be assigning the following values and then print them.
//carColor='Black'
//carYear=2019
//carMake='BMW'
//
//carColor='White'
//carYear=2018
//carMake='Toyota'
//
//Expected Output:
//Car color is Black and car year is 2019 and car model is BMW
//Car color is White and car year is 2018 and car model is Toyota