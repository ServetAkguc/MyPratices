package com.selfpractices5;

public class LotteryArrayAlex {
	public static void main(String[] args) {

		int[][] lotteryCard = { 
				{ 20, 15, 7 }, 
				{ 8, 7, 19 }, 
				{ 7, 13, 47 }

		};
		
		//[row][column]
		
		System.out.println(lotteryCard[0][0]);
		
		System.out.println("=================");
		
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
					System.out.print(lotteryCard[row][col]+" ");
			}
			System.out.println();
		}
		
	}
}
