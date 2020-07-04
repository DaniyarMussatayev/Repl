package com.syntax.repl89_107;

public class Repl107 {
	public static void main(String[] args) {
		StringBuffer word =new StringBuffer("Hello Friends");
		String reverse="";
		for (int i =word.length()-1; i>=0;i--) {
		reverse=reverse+word.charAt(i);	
		}System.out.println(reverse);
	
		
		
		
	}

}

//How would you reverse a String using StringBuffer Class
//Given String = "Hello Friends"
//
//Expected Output:
//sdneirF olleH