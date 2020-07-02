package com.syntax.repl89_107;

import java.util.Scanner;

public class Repl97 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name to proceed further with execution");
		String browser = sc.nextLine();

		browser = browser.toLowerCase();
		String result = "";
		switch (browser) {
		case "chrome":
			result = "Chrome";
			break;
		case "firefox":
			result = "Firefox";
			break;
		case "ie":
			result = "IE";
			break;
		default:
			break;
		}
		if (!result.isEmpty()) {
			System.out.printf("Proceed with %s browser", result);
		} else {
			System.out.println("Invalid browser");
		}

		sc.close();
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
