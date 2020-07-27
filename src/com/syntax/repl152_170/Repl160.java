package com.syntax.repl152_170;

public class Repl160 {
	public void display(int num) {
		System.out.println(num);
	}
	public void display(int num,double num2) {
		System.out.println("Syntax Technologies");
		System.out.println(num2);
	}
	public static void main(String[] args) {
		Repl160 o=new Repl160();
		o.display(100);
		o.display(100, 100.09);
	}
	

}

//For you to do:
//
//Overload instance method display by having different types of parameters
//Inside each method write the logic to print value of the parameter
//
//Call all methods inside your main method
//
//Expected Output:
//100
//Syntax Technologies
//100.09
