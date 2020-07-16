package com.syntax.repl120_141;

public class Repl135 {
	public static void main(String[] args) {
		System.out.println(surround("abcabcabc", "c")); // "ab(c)ab(c)ab(c)"
		System.out.println(surround("technology", "o")); // "techn(o)l(o)gy"
	}
	static String surround(String s, String search_them) {
		String surround="";
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)==(search_them.charAt(0))) {
				surround=surround+"("+search_them+")";
			}else {
				surround=surround+s.charAt(i);
			}
		}
		return surround;
	}

}

//Write a method with the following specs:    
//
//Returns:
//a String
//Name:
//surround
//Parameters:
//a String called s
//a String called search_term
//
//Then complete the method by programming the following behavior
//Return a new String built from s that has every instance of the search term surrounded by parentheses
//See below examples.
//
//Examples:
//surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
//surround("technology",'o') ==> "techn(o)l(o)gy"
