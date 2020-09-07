package com.syntax.repl212_214;

public class ExceptionHandling211 {
	  public static void main(String[] args) {
		     try{ 
		            int a[] = {10,20,30};
		            System.out.println(a[4]);
		        } 
		        catch(ArrayIndexOutOfBoundsException e){ 
		            e.printStackTrace(); 
		        } 
		  }

}
//Create a program that will handle exception to match below output:
//
//Expected Output:
//java.lang.ArrayIndexOutOfBoundsException: 4
//	at Main.main(Main.java:5)
