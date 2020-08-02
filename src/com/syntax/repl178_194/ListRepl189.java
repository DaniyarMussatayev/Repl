package com.syntax.repl178_194;

import java.util.*;

public class ListRepl189 {
	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<>();
		for(int i=50 ; i<=100; i++) {
		   list.add(i);
		}
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			if(it.next()%3!=0) {
				it.remove();
			}
		}
		
		System.out.println(list);
		}
		
		
	}



//Create a Linked List that will store Integer Objects from 50-100.
//Once Linked List is created remove all numbers that are not divisible by 3.
//
//Print Linked List
//
//Expected Output
//[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
