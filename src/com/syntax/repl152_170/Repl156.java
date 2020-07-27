package com.syntax.repl152_170;

public class Repl156 {

	int i = 10;

}

class Ba extends Repl156 {
	int i = 20;

	public void display() {
		System.out.println(i);
		System.out.println(super.i);
	}
}

class r {
	public static void main(String[] args) {
		 Ba bb= new Ba();
	     bb.display();
	}
}

//For you to do:
//
//Create class A
//declare variable int i=10;
//
//Create class B  extends A
//declare variable int i=20;
//
//create a method to display value of variable i from both classes
//
//In Main Class create an object of subclass and call method display
//
//Expected Output:
//20
//10