package com.syntax.repl195_211;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Repl199 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add(null);
		set.add("Sohil");
		set.add("Diego");
		set.add("Alijon");
		set.add("Asel");
		set.add("Sumair");

		for (String res : set) {
			System.out.println(res);
		}

		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}

//Create a Set collection in which you want to preserve an order of inserted String Objects.
//Add the below values 
//null
//Sohil 
//Diego
//Alijon
//Asel
//Sumair 
// 
//Print values 1 by 1 using loop and Iterator 
//null
//Sohil
//Diego
//Alijon
//Asel
//Sumair
//null
//Sohil
//Diego
//Alijon
//Asel
//Sumair
