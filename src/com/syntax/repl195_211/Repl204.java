package com.syntax.repl195_211;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Repl204 {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
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

//Create a Map that will preserve an order of entry objects
//Add below pair to it . 
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//
//Print all values using iterator
//
//Expected output:
//Patrick ST
//265
//Vienna
//22180
//United State
