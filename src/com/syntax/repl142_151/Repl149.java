package com.syntax.repl142_151;

public class Repl149 {
	
	public void displayA() {
		System.out.println("Class A");
	}
}

class B extends Repl149{
	public void displayB() {
		System.out.println("Class B");
	}
}

 class Mained  {
	 public static void main(String[] args) {
		 B b=new B();
		 b.displayA();
		 b.displayB();
		
	}
	
}

//1. Create Three classes (Main, A, B):
//
//Have a method that prints out the following
//For A:  "Class A"
//For B:  "Class B"
//
//Make B extend A
//
//From your Main class create an object of the B class and call the methods.
//
//Output:
// 
//Class A
//Class B
