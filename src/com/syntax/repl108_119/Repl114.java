package com.syntax.repl108_119;

public class Repl114 {
	public static void main(String[] args) {
		Repl114 obj = new Repl114();
		obj.add(20, 10);
		obj.mult(3, 10);
		obj.sub(30, 10);
	}

	void add(int a, int b) {
		int add = a + b;
		System.out.println("Addition " + add);
	}

	void mult(int a, int b) {
		int mult = a * b;
		System.out.println("Multiplication " + mult);
	}

	void sub(int a, int b) {
		int sub = a - b;
		System.out.println("Subtraction  " + sub);
	}
}

//For you to do :
//
//Step1: Create three methods that will accept 2 in parameters on integer type
//Step2: Write the logic in methods to perform actions below:
//
//The first method for multiplication
//The second method for addition 
//The third method for subtraction
//
//Step3: execute all methods
//
//1. for the addition method add two numbers to make 30 
//2. for multiplication multiply two numbers to make 30 
//3. for Subtraction subtract two numbers to equal 20
//
//Expected Output:
//Addition 30
//Multiplication 30
//Subtraction 20