package com.selfpractices5;

public class SumofEachRow {

	public static void main(String[] args) {
		int[][] num = { 
				{ 2, 1, 6, 12 }, 
				{ 9, 6, 2, 8 },  
				{ 3, 0, 15, -2 } 
				};
		int[]sum=new int [num.length];
		for(int row=0;row<num.length;row++) {
			for(int col=0;col<num[row].length;col++) {
				int element=num[row][col];
				sum[row]+=element;
			}
		}
		
		for(int element:sum) {
			System.out.println("Sum is "+element);
		}
	

	}
}
