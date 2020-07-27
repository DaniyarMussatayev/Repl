package com.syntax.repl152_170;

public class Repl161 {
	private void m1() {
		System.out.println("private m1 method");
	}
	private void m1(int n) {
		System.out.println("private m1 method with int parameter");
	}
	public static void main(String[] args) {
		Repl161 o=new Repl161();
		o.m1();
		o.m1(2);
	}
	

}
//Overload private instance method m1
//
//Call each method from the main method. 
// 
//Expected Output:
//private m1 method 
//private m1 method with int parameter
