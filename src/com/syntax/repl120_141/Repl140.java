package com.syntax.repl120_141;

public class Repl140 {
	public static void main(String[] args) {
		String[] arr = { "hey", "yolo", "hi", "this is long" };
		System.out.println(maxLength(arr));
		// should print "this is long"
	}

	public static String maxLength(String[] array) {
		String max="";
		for(String s:array) {
			if(s.length()>max.length()) {
				max=s;
			}
		}
		return max;
		}
}



//For you to do:
//
//Create the maxLength method that will accept String array of words and return the word with the largest length.
//
//Method should visible only within same package!
//
//Expected Output:
//this is long
