package com.syntax.repl152_170;

public class Repl170 {
	public static final void m1(boolean num) {
		System.out.println("Final method with boolean parameter");
	}
	public static final void m1(String str) {
		System.out.println("Final method with String parameter");
	}
	public static void main(String[] args) {
		m1(true);
		m1("hello");
	}

}
//For you to do:
//
//Overload 2 final instance methods:
//
//Call them in main method
//
//Expected Output:
//Final method with boolean parameter
//Final method with String parameter
