package com.syntax.repl212_214;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling212 {
	public static void exc() throws FileNotFoundException{
		String path=" ";
//		String path = System.getProperty(" ")+" ";
		FileInputStream fis =new FileInputStream(path);
		
//		String filePath=System.getProperty("user.dir")+"/testdata/testData.xls";
//		FileInputStream fis =new FileInputStream(filePath);
			
	}public static void main(String[] args) {
		try {
			exc();
			//System.out.println(filePath);
		} catch (Exception c) {
			System.out.println(c);
			c.printStackTrace();
			System.out.println(c.getMessage());
		}
	}

}

//class Main {
//	  public static void main(String[] args) {
//	  
//			try {
//				read("");
//			} catch (FileNotFoundException e) {
//				System.out.println(e);
//			}
//
//		}
//
//		public static void read(String filePath) throws FileNotFoundException {
//
//			FileInputStream fis = new FileInputStream(filePath);
//
//		}
//	}
//Create a method that will not be handling exception and throwing it at caller.
//In main method call method and handle the exception.
//
//Expected Output:
//java.io.FileNotFoundException:  (No such file or directory)
