package com.syntax.repl120_141;

public class Repl122 {
	public static void main(String[] args) {
		Repl122 obj =new Repl122();
		obj.nameOfCountry="USA";
		obj.capital="Washington DC";
		obj.populationSize=330000000;
		obj.display();
		
		Repl122 obj1 =new Repl122();
		obj1.nameOfCountry="Kazakhstan";
		obj1.capital="Astana";
		obj1.populationSize=18500000;
		obj1.display();
		
		
	}
	String nameOfCountry, capital;
	int populationSize;
	
	void display (){
		System.out.println("The capital of " + nameOfCountry + " is " +capital + " and population is " +populationSize);
	}
	

}

//For you to do:
//
//Declare 3 instance variables to hold:
//name of the country
//capital
//population size
//
//Create a method to display values of instance variables
//
//Create 2 Object, assign values to instance variables, execute method display;
//
//Expected Output:
//The capital of USA is Washington DC and population is 330000000
//The capital of Kazakhstan is Astana and population is 18500000
