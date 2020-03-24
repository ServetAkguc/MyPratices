package com.selfpractices6;

import java.util.Scanner;

public class MiddleLetterinOdd {
	public static void main(String[] args) {

		/*
		 * Create a String and if the String is not empty 
		 * perform the following: if the
		 * String has an odd number of characters and has 
		 * 3 or more characters, print
		 * the character in the middle of the String.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word");
		
		String greeting=scan.next();
		if(!greeting.isEmpty()) {
			if(greeting.length()>=3 && greeting.length()%2==1) {
				System.out.println(greeting.charAt(greeting.length()/2));
			}else {
				System.out.println("Even numbers of characters");
			}
		}
	}
}
