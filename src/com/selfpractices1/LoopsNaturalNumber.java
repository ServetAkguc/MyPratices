package com.selfpractices1;

public class LoopsNaturalNumber {
	public static void main(String[] args) {
		/*
		 * Write a program to calculate the sum of first 10 natural number.
		 */

		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			sum += i;

		}
		System.out.println("Sum = " + sum);

		System.out.println("=====================");

		int x = 0;
		int total=0;
		while (x <= 10) {
			total = total + x;
			x++;
		}
		System.out.println("Total = "+total);
		
		System.out.println("===========================");
		
		int i=0;
		int toplam=0;
		do {
			toplam = toplam + i;
			i++;
		}while(i<=10);
		System.out.println("Toplam = "+toplam);
	}
}
