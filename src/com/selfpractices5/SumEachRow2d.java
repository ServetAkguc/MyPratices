package com.selfpractices5;

public class SumEachRow2d {
	public static void main(String[] args) {

		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		
	
		for (int i= 0; i < a.length; i++) {
				int sumRow = 0;
			for (int j= 0; j < a[i].length; j++) {
				sumRow+= a[i][j];
			}
					  System.out.println("Sum of " + (i+1) +" row: " + sumRow);

		}
	
	}
}
