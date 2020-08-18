package com.syntax.repl195_211;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl206 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");

		System.out.println("HashMap Before Remove :");
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " : " + val);
		}
		map.remove("ONE");
		map.remove("FOUR");
		System.out.println("------------------");
		System.out.println("HashMap After Remove :");

		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " : " + val);

		}

	}

}

//Hash Map
//Create a Hash Map of String pairs 
//add the follow values
//map.put("ONE","AAA");
//map.put("TWO","BBB");
//map.put("THREE","CCC");
//map.put("FOUR","DDD");
//map.put("FIVE","EEE");
//
//Using entry set print key and values pairs using loop
//
//Remove below from Map
//"ONE"
//"FOUR"
//
//Using entry set print key and values pairs using loop
//
//Expected Output:
//HashMap Before Remove :
//FIVE : EEE
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : CCC
//------------------
//HashMap After Remove :
//FIVE : EEE
//TWO : BBB
//THREE : CCC
