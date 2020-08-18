package com.syntax.repl195_211;

public class EmployeeRepl101 {
	private String fullName;
	private int ssn;
	private double salary;

	public EmployeeRepl101(String fullName, int ssn, double salary) {
		this.fullName = fullName;
		this.ssn = ssn;
		this.salary = salary;
	}

	public void setFullName(String fullName) {
		this.ssn = ssn;
	}

	public void setSSN(int ssn) {
		this.fullName = fullName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public int getSSN() {
		return ssn;
	}
	
	public double getSalary() {
		return salary;
	}

}

//Create an Employee class that will be fully encapsulated and will have:
//variables as FullName, ssn and salary
//constructor to initialize instance variables
//getters to have an access to instance variables
//
//Create a set collection that will store # objects of Employee type and using Iterator print the value of each variable
//
//Expected Output:
//John Doe
//123456789
//80000.0
//Jane Smith
//987654321
//90000.0
//Jackie Chan
//0
//1000000.0
