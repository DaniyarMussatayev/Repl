package com.syntax.repl178_194;

public class MainRepl178 {
	public static void main(String[] args) {
		EncapsulationDemoRepl178 obj = new EncapsulationDemoRepl178();
		obj.setEmpName("John");
		System.out.println("Employee Name :" +obj.getEmpName());
		obj.setEmpAge(30);
		System.out.println("Employee Age :" +obj.getEmpAge());

	}

}
//Encapsulation
//Create Class EncapsulationDemo
//create two variable as shown below. 
//
//private String empName;
//private int empAge;
//
//Create the getter/setter methods for each variable. 
//
//In Main Class and main method. 
//Using setter methods assign the values as "John" and "30"
//Using getter methods print the values as below outputs. 
//
//Expected Output:
//Employee Name: John
//Employee Age: 30
