package com.syntax.repl195_211;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl201 {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("Street", "Patrick ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");

		Set<Entry<String, String>> set = map.entrySet();
		System.out.println(set.size());
		set.clear();
		System.out.println(set.size());
	}

}

//Create a Map in which you do not need to preserve the order of the entries
//Add below pair to it . 
//
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//
//Find how many entries are inside the map
//Remove all entires from the Map
//Find the Map size again
//
//Expected Output:
//5
//0
