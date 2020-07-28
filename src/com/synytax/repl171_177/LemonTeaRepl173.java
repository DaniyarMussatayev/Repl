package com.synytax.repl171_177;

public class LemonTeaRepl173 extends TeaParentRepl173 {
	public LemonTeaRepl173(String teaType) {
		super(teaType);
	}
	public void addSugar() {
		System.out.println("For " +teaType+ " we need 2 spoons of sugar");
	}
	
	

}
//Abstraction
//Create a Super Class Tea that will have:
//instance variable teaType;
//constructor that will initialize 
//unimplemented method addSugar(), 
//
//Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
//
//In main class create an object of 2 Child and assign them to Parent reference type.
//Execute method addSugar from both classes.
//
//Expected Output:
//For Lemon Tea we need 2 spoons of sugar
//For Chai Tea we need 1 spoon of sugar
