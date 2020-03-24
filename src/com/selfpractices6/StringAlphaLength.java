package com.selfpractices6;

public class StringAlphaLength {

	public static void main(String[] args) {
		
		/*
		 * Create a String that should be combination of letters, 
		 * numbers and special characters. 
		 * Find out how many alpha characters are there in the String.
		 */
		String combination="Good Morning 1234(*&^$)@$ How you doing";
		String alpha=combination.replaceAll("[^A-Za-z]", "");
		System.out.println(alpha);
		int newAlpha=alpha.length();
		System.out.println(newAlpha);
	
		
	}
}
