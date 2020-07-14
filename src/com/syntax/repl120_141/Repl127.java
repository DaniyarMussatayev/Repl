package com.syntax.repl120_141;

public class Repl127 {
	public static void main(String[] args) {
		Repl127 obj =new Repl127();
		obj.nonStatic();
		Repl127.staticName();
		
	}
	static String name1 ="Java is awesome.";
	String name2="Programming is amazing.";;
	
	void nonStatic() {
		System.out.println(name2);
	}
	static void staticName () {
		System.out.println(name1);
	}

}

//For you to do:
//
//Create two methods:
//The first method should be a non-static method that will print out the following message:
//"Programming is amazing."
//
//The second method should be a static method that will print out the following message:
//"Java is awesome."
//
//Execute both methods
//
//Expected Output:
//Programming is amazing.
//Java is awesome.