package com.syntax.repl89_107;

import java.util.Scanner;

public class Repl97 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name to proceed further with execution");
		String browser = sc.nextLine();
		browser =browser.toLowerCase();
		
		switch(browser) {
		case"chrome":
			System.out.println("Proceed with Chrome browser");
			break;
		case"firefox":
			System.out.println("Proceed with Firefox browser");
			break;
		case"ie":
			System.out.println("Proceed with IE browser");
			break;
		default:
			System.out.println("Invalid browser");
			break;
		}
	}
}

//For you to do:
//
//If browser is ChRoME it should print the: 
//"Proceed with Chrome browser"
//
//If browser is FireFOX it should print the: 
//"Proceed with Firefox browser"
//
//If browser is IE it should print the:
//"Proceed with IE browser"
//
//If any other browser it should print the:  
//"Invalid browser"
