package com.syntax.repl40_65;

import java.util.Scanner;

public class Repl41 {
	public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
	    int age;
	    String scenario = null;
	    System.out.println("enter the age of the Child");
	     age = scan.nextInt();
	    switch (age){
	      case 1:
	        scenario = "Crawl";
	        break;
	      case 2:
	        scenario = "Talk";
	        break;
	      case 3:
	        scenario = "Dance";
	        break;
	      case 4:
	        scenario = "get Trouble";
	        break;
	      default:
	      System.out.println("I don't know how old you are");
	    }
	    if (scenario!=null){
	      System.out.println("You can " + scenario);
	    }
	    
	  }

}

//For you to do:
//Write a program using the switch statement  
//Let us consider the scenario regarding the born baby age 
//
//First Output: "enter the age of the Child"
//
//case 1: if age is 1 print as "You can Crawl"
//
//case 2 : if age is 2 print as  "You can Talk"
//
//case 3: If age is 3 print as "You can Dance"
//
//case 4: if age is 4 print as "You can get  Trouble"
//
//Other than this age (1-4) it should print "I don't know how old you are" 


