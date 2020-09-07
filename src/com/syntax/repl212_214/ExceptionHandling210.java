package com.syntax.repl212_214;

public class ExceptionHandling210 {
	public static void main(String[] args) {
		
		int a = 10, b = 0, result;

		try {
			result = a / b;
			System.out.println("Result = " + result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
//Complete the code, handle possible exception
//
//Expected Output: 
/// by zero