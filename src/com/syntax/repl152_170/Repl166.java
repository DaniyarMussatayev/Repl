package com.syntax.repl152_170;

public class Repl166 {
	String type;

	public Repl166(String type) {
		this.type = type;
	}

	public void eat() {
		System.out.println(type + " eats");
	}

	public void sleep() {
		System.out.println(type + " sleeps");
	}
}
class Cat extends Repl166{
	public Cat(String type) {
		super(type);
	}

	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}
}
class Kitten1 extends Repl166{
	public Kitten1(String type) {
		super(type);

	}

	public void eat() {
		System.out.println(type + " eats milk");
	}
	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}
}
class Kitten2 extends Repl166{
	public Kitten2(String type) {
		super(type);

	}

	public void eat() {
		System.out.println(type + " eats snacks");
	}
	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}
}
class Kitten3 extends Repl166{
	public Kitten3(String type) {
		super(type);

	}

	public void eat() {
		System.out.println(type + " eats everything");
	}
	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}
}

class AnimalTest{
	public static void main(String[] args) {
		
	Repl166[] cats= {new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};
		
		for(Repl166 c:cats) {
			c.eat();
			c.sleep();
		}
}
}

//Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.
//
//Create a subclass Cat in which override method sleep
//
//Create 3 Kitten subclasses of a Cat class and override method eat 
//for 1 kitten - eats milk
//for 2 kitten - eats snack
//for 3 kitten - eats everything
//
//In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
//
//Expected Output:
//Cat eats
//Cat sleeps a lot
//kitten1 eats milk
//kitten1 sleeps a lot
//kitten2 eats snacks
//kitten2 sleeps a lot
//kitten3 eats everything
//kitten3 sleeps a lot

