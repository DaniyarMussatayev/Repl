package com.syntax.repl195_211;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Repl100 {
	public static void main(String[] args) {
		Collection<StudentRepl100> col = new LinkedHashSet<>();
		col.add(new StudentRepl100(101, "Samir", "Jawaid"));
		col.add(new StudentRepl100(102, "Asel", "Umurzakova"));
		col.add(new StudentRepl100(103, "Diego", "Jurez"));
		col.add(new StudentRepl100(104, "Sohil", "Aaryan"));
		col.add(new StudentRepl100(105, "Alijon", "Nazarov"));

		for (StudentRepl100 res : col) {
			res.studentInfo();
			
		}
	}

}

//Create a student class that will have 
//variables as studentId, name and lastName
//constructor
//method to display students details
//
//Create a set that will store 5 different students in an order they been added to the collection.
//
//Execute method to display students details
//
//Expected Output:
//Student details: Samir Jawaid with id: 101
//Student details: Asel Umurzakova with id: 102
//Student details: Diego Jurez with id: 103
//Student details: Sohil Aaryan with id: 104
//Student details: Alijon Nazarov with id: 105
