package com.syntax.repl120_141;

public class Repl136 {

	private void n1() {
		System.out.println("This is Private Method");
	}

	void n2() {
		System.out.println("This is Default Method");
	}

	protected void n3() {
		System.out.println("This is Protected Method");
	}

	public void n4() {
		System.out.println("This is Public Method");
	}

	public static void main(String[] args) {
		Repl136 obj = new Repl136();
		obj.n1();
		obj.n2();
		obj.n3();
		obj.n4();
	}

}

//For you to do:
//Please create methods with different access modifiers (one for each access modifier) and call them properly in main method one by one
// 
//In each method write the logic accordingly like for private method write the logic in the println Statement as "This is Private Method" accordingly for rest of the methods that have different access modifiers should be a total of 4 outputs, please make sure they are in the same order that is printed below.
//
//Expected Output:
//This is Private Method
//This is Default Method
//This is Protected Method
//This is Public Method
