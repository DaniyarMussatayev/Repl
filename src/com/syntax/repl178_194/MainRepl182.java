package com.syntax.repl178_194;

public class MainRepl182 {
	public static void main(String[] args) {
		PersonRepl182 obj=new PersonRepl182("John", "Doe", "123-45-6789", 10, 25, 1900);
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.formatBirthday());
		System.out.println(obj.getSSN());
	}

}

//Encapsulation
//Create the a Person class with the following:
//Class Variables
//firstname
//lastname
//birthmonth
//birthday
//birthyear
//String ssn
//
//Constructor
//The main constructor should take in all values and assign them to their respective private class variables
//
//Methods
//Create a public getters to access all the variables. 
//
//Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"
//
//in Main Class. 
//
//Instantiate and object of Person and provide values. follows below outputs for values. 
//
//using getter and method print them separately. 
//Note: Read carefully the steps. 
//
//Expected Output:
//John
//Doe
//10/25/1900
//123-45-6789
