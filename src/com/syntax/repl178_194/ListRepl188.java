package com.syntax.repl178_194;

import java.util.ArrayList;
import java.util.Scanner;

public class ListRepl188 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		for (int i=0;i<5;i++){
			list.add(input.nextInt());
		}

		for (int num : list) {
			System.out.print(num + " ");
		}
	}

}
//Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
//
//Numbers in:
//4
//62
//8
//5
//4
//
//Expected Output:
//4 62 8 5 4 
