package com.syntax.repl152_170;

public class Repl169 {
	public static final double avgElements(int[] array) {
		int sum=0;
		double average=array.length;
		for (int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}average=sum/average;
		return average;
	}
	public static void main(String[] args) {
		int[] a = {2,7,3,8,4};
		System.out.println(avgElements(a));
	}
}

//For you to do:
//
//Create final method avgElements that will average all the elements in an integer array (passed to the method as a parameter) and return the average.  
//
//Expected Output:
//4.8

