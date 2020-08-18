package com.syntax.repl195_211;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Repl196 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("third");
		set.add("first");
		set.add("second");
		System.out.println(set);

		set.clear();
		System.out.println(set);
	}
}

//Create a Set and and below values to it. 
//[third, first, second]
//
//Print HashSet and then remove all the elements from Hashset and print it again.
//
//Expected Output:
//[third, first, second]
//[]
