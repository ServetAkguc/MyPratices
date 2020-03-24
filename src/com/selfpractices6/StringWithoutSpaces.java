package com.selfpractices6;

public class StringWithoutSpaces {

	public static void main(String[] args) {
		
		/*
		 * Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
		 */
		String sentence="I love my family so much!";
		sentence=sentence.replaceAll(" ","");
		System.out.println(sentence);
		
	}
}
