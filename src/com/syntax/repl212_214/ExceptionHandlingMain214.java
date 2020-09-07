package com.syntax.repl212_214;

public class ExceptionHandlingMain214 {
	public static void checkGrades(int grade) throws SyntaxStudentException214 {
		if(grade > 90) {
			throw new SyntaxStudentException214("You are an exceptionally awesome student");
		}else {
			System.out.println("You are a great student");
		}
	}
  public static void main(String[] args){
    try {
			checkGrades(91);
		}catch(SyntaxStudentException214 sse){
			System.out.println(sse);
		}
  }

}
