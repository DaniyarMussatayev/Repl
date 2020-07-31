package com.syntax.repl178_194;

import java.io.ObjectInputStream.GetField;

public class MainRepl179 {
	public static void main(String[] args) {
		EncapsulationDemoRepl179 obj=new EncapsulationDemoRepl179();
		obj.setEmpName("Mario");
		System.out.println("Employee Name: "+obj.getEmpName());
		
		obj.setEmpAge(32);
		System.out.println("Employee Age: "+obj.getEmpAge());
	}

}
//Encapsulation
//Create Class EncapsulationDemo that will have 2 variables empName and empAge;
//Create the getter/setter methods for each variable. 
//
//In Main Class and main method
//
//Using setter methods assign the values as "Mario" and "32"
//Using getter methods print the values as below outputs. 
//
//Expected Output:
//Employee Name: Mario
//Employee Age: 32