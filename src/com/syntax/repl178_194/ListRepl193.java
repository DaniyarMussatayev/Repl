package com.syntax.repl178_194;

import java.util.Iterator;
import java.util.LinkedList;

public class ListRepl193 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		int sum =0;
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(666);

		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
				
				sum=sum+it.next();
		}
		System.out.println("Result of sum is "+sum);

		
	}

}

//Create Linked List that will store Integer Objects
//
//Add the values below:
//111
//222
//333
//444
//555
//666
//
//Create a logic to calculate sum of the all the values in list. 
//
//Print the result of sum. 
//
//Expected Output:
//Result of sum is 2331
