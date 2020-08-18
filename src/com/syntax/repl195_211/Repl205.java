package com.syntax.repl195_211;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Repl205 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Street", "Patrick ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");

		Collection<String> val = map.values();
		for (String v : val) {
			System.out.println(v);

		}

	}

}

//Create a HashMap of String. 
//
//Add below pair to it . 
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//
//Print all the values in upper case using entrySet 
//
//Expected Output: 
//265
//22180
//PATRICK ST
//UNITED STATE
//VIENNA
