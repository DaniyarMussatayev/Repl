package com.syntax.repl195_211;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

import com.syntax.repl195_211.EmployeeRepl101;

public class Repl101 {
	public static void main(String[] args) {
		Collection<EmployeeRepl101> collection = new LinkedHashSet<>();
		collection.add(new EmployeeRepl101("John Doe", 123456789, 80000.0));
		collection.add(new EmployeeRepl101("Jane Smith", 987654321, 90000.0));
		collection.add(new EmployeeRepl101("Jackie Chan", 0, 1000000.0));

		Iterator<EmployeeRepl101> it = collection.iterator();
		while(it.hasNext()) {
			EmployeeRepl101 emp=it.next();
			System.out.println(emp.getFullName());
			System.out.println(emp.getSSN());
			System.out.println(emp.getSalary());

		}

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
