package com.syntax.repl152_170;

public class Repl163 {
	public void method() {
		System.out.println("Parent method");
	}
}

class Childddd extends Repl163{
	@Override
	public void method() {
		System.out.println("Child method");
	}
}

class Te{
	public static void main(String[] args) {
		Repl163 o=new Childddd();
		o.method();
	}
}

//In Parent Class create a method with name method() that will print  "Parent method"
//
//Override method() in Child class that will print "Child method"
//
//In Main Class create objects of child and parent class and call its method. 
//
//Expected Output:
//Parent method
//Child method
