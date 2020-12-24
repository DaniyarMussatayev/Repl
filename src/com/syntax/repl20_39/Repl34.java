package com.syntax.repl20_39;

import java.util.Scanner;

public class Repl34 {
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Please enter 3 distinct numbers");
	    int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
	    int num3 = scan.nextInt();
	    
	    if (num1 > num2){
	      if(num3 > num1){
	        System.out.println("The largest number is " + num3);
	      }else{
	        System.out.println("The largest number is " + num1);
	      }
	    }else{
	      if (num3 > num2){
	        System.out.println("The largest number is " + num3);
	      }else {
	        System.out.println("The largest number is " + num2);
	      }
	    }
	  }

}

//Write a program to find the largest number among three distinct numbers using nested if condition
//Please use Scanner class to take input from users
//
//Expected Output:
//Please enter 3 distinct numbers
//The largest number is 14
