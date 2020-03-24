package com.selfpractices4;
;

public class ArrayForLoop {
	public static void main(String[] args) {

		int[] grades= {10,9,5,6,7,8,72,6,4,8};
		for (int i = 0; i < grades.length; i++) {
			if(grades[i]==72) {
				System.out.println("Found! Found at index "+i);
			}
		
		}
		
	}
}
