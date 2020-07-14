package com.syntax.repl120_141;

public class Repl138 {
	public String name1 = "public";
	protected String name2 = "protected";
	String name3 = "default";
	private String name4 = "private";

	public void display() {
		System.out.println(name1);

	}

	protected void display1() {
		System.out.println(name2);
	}

	void display2() {
		System.out.println(name3);
	}

	private void display3() {
		System.out.println(name4);
	}

	public static void main(String[] args) {
		Repl138 obj = new Repl138();
		obj.display2();
		obj.display1();
		obj.display();
	}
}

//For you to do:
//
//In AnotherClass declare a private, default, protected, public methods and have them each return the name of the what access modifier they are using.
//All methods should be accessible by class name
//
//Call methods of Another class inside Main class
//
//Expected Output:
//default
//protected
//public
