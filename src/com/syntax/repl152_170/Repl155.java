package com.syntax.repl152_170;

public class Repl155 {
	public Repl155() {
		System.out.println("I");
	}
}
class B extends Repl155{
	public B() {
		System.out.println("am");
	}
}
class C extends B{
	public C() {
		System.out.println("a tester");
	}
}

class Nain{
	public static void main(String[] args) {
		C c= new C();
	}
}

//1. Create three classes (A, B, C)
//
//Write two constructors:
//
//* Have a default constructor that prints out the following
//For A:  "I"
//For B: "am"
//For C: "a tester"
//
//Make C extend B
//and B extend A
//
//From your Main class create an object of the C class.
//
//Expected Output:
//I
//am
//a tester
