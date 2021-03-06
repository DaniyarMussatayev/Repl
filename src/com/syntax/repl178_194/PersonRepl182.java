package com.syntax.repl178_194;

public class PersonRepl182 {
	private String firstName,lastName,ssn;
	private int birthMonth, birthDay,birthYear;
	
	public PersonRepl182(String firstName, String lastName, String ssn,int birthMonth, int birthDay, int birthYear ) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.ssn=ssn;
		this.birthMonth=birthMonth;
		this.birthDay=birthDay;
		this.birthYear=birthYear;
	}
	

	public String getFirstName() {
		return firstName;
		
	}

	public String getLastName() {
		return lastName;
	}

	public int getBirthMontth() {
		return birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public int getBirthYear() {
		return birthYear;
	}
	public String getSSN() {
		return ssn;
	}
	
	public String formatBirthday() {
		
		return this.birthMonth + "/" + this.birthDay + "/" + this.birthYear;
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
