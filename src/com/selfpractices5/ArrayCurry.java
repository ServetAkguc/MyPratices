package com.selfpractices5;

public class ArrayCurry {

	public static void main(String[] args) {
		int[][] grades= {
				{1,5,3,0,9},	
				{8,4,2,4,3,5,6,9},
				{4,5,7,8,9,6},
				{7,8,9,9,9,7,5,4,5,4,5,5,6}
		};
		System.out.println(grades[1][6]);
		System.out.println(grades.length);//row
		System.out.println(grades[1].length);//columns
		for(int row=0;row<grades.length;row++) {
			for(int col=0;col<grades[row].length;col++) {
		
			System.out.print(grades[row][col]+" ");
		}
			System.out.println();
	}
}
}