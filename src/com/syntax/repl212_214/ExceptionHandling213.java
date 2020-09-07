package com.syntax.repl212_214;

public class ExceptionHandling213 {

	public static void main(String[] args) {
		try {
			tempCheck(28);
		} catch (RuntimeException re) {
			System.out.println(re);
		}
	}

	public static void tempCheck(int temp) {
		if (temp < 32) {
			throw new RuntimeException("It is freezing");
		}
	}
}
//Create a method that will do temperature check. Anytime user passes temperture that is below 32 method should throw an Exception saying "It is freezing"
//
//In Main method call the method and handle an Exception
//
//Expected Output: 
//java.lang.RuntimeException: It is freezing
