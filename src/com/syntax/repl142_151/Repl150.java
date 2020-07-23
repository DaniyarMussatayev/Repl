package com.syntax.repl142_151;

public class Repl150 {
	String name, lastName;
	int  age;
}

class Employee extends Repl150{
	int salary;
	public void displayE() {
		System.out.println(name+" "+lastName+" "+age+" "+salary);
	}
}

class Student extends Employee{
	int grade;
	public void displayS() {
		System.out.println(name+" " +lastName+" "+age+" "+grade);
	}
}

class Retiree extends Student{
	String seniorActivity;
	public void displayR() {
		System.out.println(name+" " +lastName+" "+age+" "+seniorActivity);
	}
}
class Maain{
	public static void main(String[] args) {
		Employee r=new Employee();
		r.name="Joe";
		r.lastName="Smith";
		r.age=35;
		r.salary=35000;
		r.displayE();
		
		Student r1=new Student();
		r1.name="Adam";
		r1.lastName="Smith";
		r1.age=15;
		r1.grade=10;
		r1.displayS();
		
		Retiree r2=new Retiree();
		r2.name="Frank";
		r2.lastName="Smith";
		r2.age=15;
		r2.seniorActivity="tour";
		r2.displayR();
		
	}
}


//1. Create four classes (Person, Employee, Student, Retiree)
//
//* Have properties
//For Person: name(String)
//For Person: lastName(String)
//For Person: age(int)
//For Employee: salary(int)
//For Student: grade(int)
//For Retiree: seniorActivity(String)
//
//At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output
//
//Create multilevel inheritance: Person --> Employee --> Student --> Retiree
//
//From your Main class create objects of the Employee, Student and Retiree classes and call the print method.
//
//
//Expected Output: 
//Joe Smith 35 35000
//Adam Smith 15 10
//Frank Smith 15 tour
