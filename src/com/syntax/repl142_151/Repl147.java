package com.syntax.repl142_151;

public class Repl147 {
	String model;
	double price, quantity;

	public Repl147(String model, double price, double quantity){
		    this.model = model; 
		    this.price = price; 
		    this.quantity = quantity; 
		  }

	public void carStockValue() {

		double stockValue = this.price * this.quantity;

		System.out.println(model + " Stock Value " + stockValue);
	}
}

class carObject {
	public static void main(String[] args) {
		Repl147 obj1 = new Repl147("Toyota 2019", 25000,100);
		obj1.carStockValue();

		Repl147 obj2 = new Repl147("BMW 2019", 65298,10);
		obj2.carStockValue();
	}
}

//In carObject class:
//Create instance variables as below.
//model
//price, 
//quantity
//
//Create a constructor that will initialize instance variables. 
//
//Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result. 
//
//run the application in Main Class
//
//Expected Output:
//Toyota 2019 Stock Value 2500000.0
//BMW 2019 Stock Value 652980.0
//
//Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations
