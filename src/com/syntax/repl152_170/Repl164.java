package com.syntax.repl152_170;

public class Repl164 {
	public void hello() {
		System.out.println("method in Parent class");
	}
}

class Child1 extends Repl164 {
	
	public void hello() {
		System.out.println("method in Child1 class");
	}
}

class Child2 extends Repl164 {
	public void hello() {
		System.out.println("method in Child2 class");
	}
}

class Child3 extends Repl164 {
	public void hello() {
		System.out.println("method in Child3 class");
	}
}

class ChildTest1 {
	public static void main(String[] args) {
		Repl164[] o= {new Child1(),new Child2(), new Child3()};
		for(Repl164 o1:o) {
			o1.hello();
		}
	} 
	
	
	
}

//Create a method hello() in parent class that will print "method in Parent class" then override  that method is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"
//
//In Main Class create 3 object of the child classes and store in into an array and call method hello():
//
//Expected Output:
//method in Child1 class
//method in Child2 class
//method in Child3 class
