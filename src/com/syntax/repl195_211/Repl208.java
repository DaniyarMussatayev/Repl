package com.syntax.repl195_211;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl208 {
	static void Display(Map<String, Integer> map) {
		boolean isEmpty = map.isEmpty();
		if (isEmpty) {
			System.out.println("map is empty");

		} else {
			Set<Entry<String, Integer>> set = map.entrySet();
			for (Entry<String, Integer> entry : set) {
				System.out.println(entry.getKey() +" : "+ entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20);
		
		Display(map);
		map.clear();
		Display(map);

	}

}
//HashMap, Methods, reusability, Logic
//Create a Method in Main class using below specification. 
//Method Name: Display. 
//Return Type: Void
//Parameters : Map<String,Integer>
//Logic: 
//First the method will check the given map is empty or not. 
//If the map is not empty print pairs of key and value using loops
//If map is empty simply print "map is empty"
//
//NOW IN MAIN METHOD
//Create HashMap of String keys and Integer values
//add values as below
//map.put("mango", 10); 
//map.put("apple", 30); 
//map.put("orange", 20); 
//
//using created display method to display. 
//
//then clear the map. 
//
//use the same method to display