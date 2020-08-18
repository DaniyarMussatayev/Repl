package com.syntax.repl195_211;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Repl207 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		System.out.println("HashMap Before Replace :");
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " : " + val);
		}
		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		System.out.println("------------------");
		System.out.println("HashMap After Replace :");

		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " : " + val);

		}

	}

}
//Create Hash Map. 
//add the follow values
//
//map.put("ONE","AAA");
//map.put("TWO","BBB");
//map.put("THREE","CCC");
//map.put("FOUR","DDD");
//map.put("FIVE","EEE");
//
//Using EntrySet print the key and values pairs using iterator only
//
//replace with below key THREE--> ASEL and key FIVE-->SUMAIR
//
//Using EntrySet print the key and values pairs using iterator only
//
//OUTPUT
//
//HashMap Before Replace :
//FIVE : EEE
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : CCC
//------------------
//HashMap After Replace :
//FIVE : SUMAIR
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : ASEL
