package com.selfpractices5;

public class Replit84 {
	public static void main(String[] args)
	{
		//Write a program that prints the total number of 
		//elements that are negative AND odd

		int[][] numbers = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
	//should print 3

			int negative = 0;
			for (int j = 0; j < numbers.length; j++) {
				for (int i = 0; i < numbers[j].length; i++) {
					if (numbers[j][i] < 0 && numbers[j][i] % 2!=0) {
						negative+= i;
					}
				}
			}
	     System.out.println(negative);
		}
	}