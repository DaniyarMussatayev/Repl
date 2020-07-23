package com.syntax.repl142_151;

public class Repl146 {
	String name, lastName,startDate;
	int employeeId, salary;

	public Repl146() {

	}

	public Repl146(String name,String lastName,int employeeId,String startDate,int salary ) {
		this.name = name;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.salary=salary;
	}

	public void display() {
		System.out.println(name + " " + lastName + " " + employeeId + " " + startDate+" "+salary);
	}


}

class Employeee {
	public static void main(String[] args) {
		Repl146 obj1 = new Repl146();
		obj1.display();
		
		Repl146 obj2 = new Repl146("Joe", "Smith", 12345, "01/01/1970", 35000);
		obj2.display();
	}
}



//1. Complete the Employee.java class:
//
//Include the following class variables:
//* name(String)
//* lastName(String)
//* employeeId(int)
//* startDate(String)
//* salary(int)
//
//
//Write two constructors:
//
//* non-argument constructor
//* parameterized constructor that will initialize all instance variables
//
//Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.
//
//
//Output:
// 
//null null 0 null 0
//Joe Smith 12345 01/01/1970 35000
