package com.syntax.repl152_170;

public class Repl162 {
	static void m1() {
		System.out.println("static method without parameter");
	}
	static void m1(int n) {
		System.out.println("static method with int parameter");
	}
	public static void main(String[] args) {
		Repl162 o=new Repl162();
		o.m1();
		o.m1(2);
	}

}

//Overload static method and then execute both overloaded methods.
//
//Expected Output:
//static method without parameter
//static method with int parameter
