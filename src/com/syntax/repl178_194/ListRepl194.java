package com.syntax.repl178_194;

import java.util.*;

public class ListRepl194 {
	public static void main(String[] args) {

		List<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
		Iterator<String> it =countries.iterator();
		while(it.hasNext()) {
			if(it.next().equals("USA" || "Rissia")) {
				
			}
				
			
		}
	}
}



//For you to do:
//
//Create a method that will remove an element based on the specified condition from given List and return new List;
//
// Expected Output:  
//[USA, Kazakhstan, Pakistan, Russia]
