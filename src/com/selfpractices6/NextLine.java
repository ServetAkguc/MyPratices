package com.selfpractices6;

import java.util.Scanner;

public class NextLine {
	 public static void main(String[] args) {
		 
	        Scanner input = new Scanner(System.in);
	 
	        System.out.print("Enter a sentence for string one: ");
	 
	        String one = input.next();
	 
	        System.out.println("1st sentence is \"" + one + "\""); /*The whole string would be printed*/
	        System.out.println("Enter sentence for string two: ");
	 
	        String two = input.nextLine();
	 
	        System.out.println("2nd word is: \"" + two + "\"");
	 
	        String three = input.next();
	 
	        System.out.println("3rd word is: \"" + three + "\"");
	        System.out.println("4th word is \"" + input.next() + "\"");
	    }
	}