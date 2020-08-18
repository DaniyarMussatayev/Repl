package com.syntax.repl195_211;

import java.util.HashSet;
import java.util.Set;

public class Repl195 {
	public static void main(String[] args) {
		Set<Integer> list = new HashSet<>();
		list.add(111);
		list.add(111);
		list.add(111);
		list.add(999);
		list.add(999);
		list.add(999);

		for (Integer res : list) {
			System.out.println(res);
			
		}
	}

}
//Create the HashSet with list of Integers add the below numbers for the list
//111
//111
//111
//999
//999
//999
// 
//Print elements one by one.
//
//Expected Output
//999
//111
