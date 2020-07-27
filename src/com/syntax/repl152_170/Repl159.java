package com.syntax.repl152_170;

public class Repl159 {
	 public void sub(int a, int b) {
			System.out.println(a-b);
		}
		
		public void sub(int a, int b, int c) {
			System.out.println(a-b-c);
		}
		
		public void sub(int a, int b, int c, int d) {
			System.out.println(a-b-c-d);
		}
		
		public static void main(String[] args) {
			Repl159 obj=new Repl159();
			obj.sub(70, 15, 10, 5);
			obj.sub(60, 20, 10);
			obj.sub(30, 10);
	}
}

//Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
//In main method execute all 3 methods to match the output:
// 
//Expected Output
//40 (should come from subtracting 4 numbers)
//30 (should come from subtracting 3 numbers)
//20 (should come from subtracting 2 numbers)