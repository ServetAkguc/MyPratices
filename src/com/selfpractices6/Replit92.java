package com.selfpractices6;

import java.util.Scanner;

public class Replit92 {

	public static void main(String[] args) {
		/*
		 * Using Scanner class input string value. 
		 * Print out the following:
		 * "The first 3 letters of ___ is ___"
		 * 
		 * For example, if the input is "banana", 
		 * your output should be:
		 * "The first 3 letters of banana is ban".
		 */
		 Scanner input=new Scanner(System.in);
		    String user=input.next();
		   
		    System.out.println("The first 3 letters of "+user+" is "+user.substring(0, 3));
	}
}
