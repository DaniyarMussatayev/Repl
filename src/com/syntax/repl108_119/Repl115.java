package com.syntax.repl108_119;

public class Repl115 {

	String myMeth(String word) {
		String print = " ";
		for (int i =0; i<word.length();i++) {
			print=print+word.charAt(i);
		}
		return print;

	}
	public static void main(String[] args) {
		Repl115 obj =new Repl115();
		String str = "test";
		System.out.println(obj.myMeth(str).toUpperCase());
	}
	
	// instructor way
//	public static String makeCapital(String name)
//	{
//		return name.toUpperCase();
//	}
//	
//	//test case below (dont change):
//	public static void main(String[] args){
//		System.out.println(makeCapital("test"));
//	}
}

//Create a method that will accept a String as a parameter and return new String all in upper case
//
//Call method
//
//Expected Output:
//TEST