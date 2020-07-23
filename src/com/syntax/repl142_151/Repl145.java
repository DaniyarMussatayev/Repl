package com.syntax.repl142_151;

public class Repl145 {
	String dogName;
	double dogWeight;
	static String breed = "Mutt";
	
	public Repl145(String dogName, double dogWeight) {
		this.dogName=dogName;
		
		this.dogWeight=dogWeight;
	}
	public void display() {
		System.out.println(dogName+" "+breed+" "+dogWeight);
	}
}
class Dog{
	public static void main(String[] args) {
		Repl145 obj1=new Repl145("Tarzan",50.0);
		obj1.display();
		
		Repl145 obj2=new Repl145("Lucy",10.0);
		obj2.display();
	}
}

//1. Complete the Dog.java class:
//
//Create following class variables. 
//dogName
//dogWeight   
//static dogBreed=Mutt;
//For all methods and variables use proper naming convention. 
//
//Create constructor to initialize instance variables 
//
//2. In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.
//
//Expected Output:
//Tarzan Mutt 50.0
//Lucy Mutt 10.0
