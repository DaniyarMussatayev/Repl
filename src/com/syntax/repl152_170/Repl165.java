package com.syntax.repl152_170;

public class Repl165 {
	public void m1() {
		System.out.println("I am parent public method");
	}
	protected void m2() {
		System.out.println("I am parent protected  method");
	}
	 void m3() {
		System.out.println("I am parent default  method");
	}
	 private void m4() {
			System.out.println("I am parent private  method");
		}
}
class Childdddd extends Repl165{
	public void m1() {
		System.out.println("I am a child public method");
	}
	protected void m2() {
		System.out.println("I am a child protected  method");
	}
	 void m3() {
		System.out.println("I am a child default  method");
	}
	 private void m4() {
			System.out.println("I am a child private  method");
		}
}

class Stest {
	public static void main(String[] args) {
		Repl165 o=new Childdddd();
		o.m1();
		o.m2();
		o.m3();
	}
}
//Parent class create 4 methods with different level of access modifiers. In each method print "I am parent public/protected/default/private method".
//
//Override methods in child class
//
//In Main Class create object of the child class and see which methods are available
//
//Expected Output: 
//I am a child public method
//I am a child protected method
//I am a child default method
