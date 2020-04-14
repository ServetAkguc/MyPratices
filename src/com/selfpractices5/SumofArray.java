package com.selfpractices5;

public class SumofArray {

	public static void main(String[] args) {
		int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };

		int sum=0;
		for (int i = 0; i < num.length; i++) {
			System.out.println("I am at row index "+i);
			for (int j = 0; j < num[i].length; j++) {
				sum+=num[i][j];
				System.out.print(num[i][j]+" ");
				
			}
			System.out.println("The sum of all numbers is " + sum);
		}
		
	}
}
