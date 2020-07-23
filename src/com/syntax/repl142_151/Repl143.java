package com.syntax.repl142_151;

public class Repl143 {
	String make, model;
	int topSpeed, numbersOfDoors;
	double price;

	public Repl143(String make, String model, int numbersOfDoors, int topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.numbersOfDoors = numbersOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}

	public Repl143(String make, String model, int topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
		this.price = price;
		numbersOfDoors = 4;

	}

	public Repl143(int numbersOfDoors, int topSpeed, double price) {
		this.numbersOfDoors = numbersOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
		make = "unknown";
		model = "unknown";
	}

	public Repl143(String make, String model, int numbersOfDoors, int topSpeed) {
		this.make = make;
		this.model = model;
		this.numbersOfDoors = numbersOfDoors;
		this.topSpeed = topSpeed;
		price = 0.0;
	}

	public void display() {
		System.out.println(make + " " + model + " " + numbersOfDoors + " " + topSpeed + " " + price);
	}
}

class Second {
	public static void main(String[] args) {
		Repl143 obj1 = new Repl143("Toyota", "Prius", 4, 120, 30000.0);
		obj1.display();

		Repl143 obj2 = new Repl143("Toyota", "Prius", 120, 30000.0);
		obj2.display();

		Repl143 obj3 = new Repl143(4, 120, 30000.0);
		obj3.display();

		Repl143 obj4 = new Repl143("Toyota", "Prius", 4, 90);
		obj4.display();
	}
}

//1. Complete the Car.java class:
//Create the following variable (Choose proper datatype)
//* make
//* model
//* numberOfDoors
//* topSpeed
//* price
//following the proper naming convention for variables. 
//
//Write four constructors:
//* The first constructor(with all parameters)
//* A secondary constructor Have all parameters except numberOfDoors. (numberOfDoors value should assign to 4 inside constructor)
//* A third constructor Have all parameters except make and model . (make and model value should assign to "unknown" inside constructor) 
//* A fourth constructor Have all parameters except topSpeed and price;(topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)  
//
//Create a display method in Cars class to print the class variable value in console. 
//
//2. Test your code with the Main.java class:
//Create several Car objects using all Constructors. 
//then call display method with each object. 
//
//Output: 
//Toyota Prius 4 120 30000.0
//Toyota Prius 4 120 30000.0
//unknown unknown 4 120 30000.0
//Toyota Prius 4 90 0.0
