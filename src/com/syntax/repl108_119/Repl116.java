package com.syntax.repl108_119;

public class Repl116 {
	public static void main(String[] args) {
		Repl116 obj = new Repl116();
		System.out.println(obj.num(-1, 1));
	}

	boolean num(int a, int b) {
		boolean bothEven;
		if (a % 2 == 0 && b % 2 == 0) {
			bothEven = true;
		} else {
			bothEven = false;
		}
		return bothEven;
	}
	//instructor way
//	public static boolean  bothEven(int num1,int num2)
//	{
//		if(num1%2==0 && num2%2==0){
//		  return true;
//		 } else{
//		   return  false;
//		 }
//	}
//	
//	public static void main(String[] args){
//		System.out.println(bothEven(5,6)); //should be false
//	}
}

//Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
//( Return false if one or both given numbers are not even)
//
//Examples:
//bothEven(4,6) ==> true
//bothEven(3,4) ==> false
//bothEven(-1,1) ==> false
//
//Expected Output:
//false