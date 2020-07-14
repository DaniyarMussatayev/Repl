package com.syntax.repl120_141;

public class Repl132 {
		public static void main(String[] args) {
			int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 1, 3, 5, 7 } };
			int[][] newArray = reduce10(a);
			// print the Array
			for (int[] array : newArray) {
				for (int num : array) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
		}

		static int[][] reduce10(int[][] nums) {

			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums[i].length; j++) {

					nums[i][j] = nums[i][j] - 10;
				}
			}

			return nums;
		}

}

//For you to do:
//
//Complete the reduce10 method by making it subtract 10 from every element of the double array nums.
//The method should static and it should return a new 2D array object
//Print values from new array in the format below
//
//Expected Output:
//-9 -8 -7 -6 
//-6 -5 -4 -3 
//-9 -7 -5 -3 
