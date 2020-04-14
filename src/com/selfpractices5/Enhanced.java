package com.selfpractices5;

public class Enhanced {
	public static void main(String[] args) {
		int[][] num = { { 2, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 15, -2 } };

		int sum = 0;
		int largest = 0;
		int minimum = 0;
		for (int[] n : num) {
			for (int n1 : n) {
				System.out.print(n1 + " ");
				if (largest < n1) {
					largest = n1;
				}
				if (minimum > n1) {
					minimum = n1;

				}
				sum += n1;

			}
			System.out.println();
			System.out.println("The sum of all numbers is " + sum);
		}
		System.out.println("the largest number is " + largest);
		System.out.println("the minimum number is " + minimum);
	}
}
