package com.selfpractices5;

import java.util.Scanner;

public class DenemeReplit {
	public static void main(String[] args) {
		/*
		 * int[][] a = { { 1, 1, 2 }, // sum = 4 { 3, 1, 2 }, // sum = 6 { 3, 5, 3 }, //
		 * sum = 11 { 0, 1, 2 } // sum = 3 };
		 * 
		 * int sum = 0; for (int row = 0; row < a.length; row++) { sum+=a[row].length;
		 * System.out.println(sum);
		 * 
		 * }
		 */

		/*
		 * String[] days=new String[7];
		 * 
		 * Scanner input=new Scanner(System.in);
		 * 
		 * for (int i=0; i<7; i++) {
		 * System.out.println("Please enter day "+(i+1)+" of the week :");
		 * days[i]=input.nextLine();
		 * 
		 * }
		 */
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		for (int i=0;i<numbers.length;i++)
		{
			numbers[i] = input.nextInt();
		}
		
		for (int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]*10);
		
		}
		
	}
}