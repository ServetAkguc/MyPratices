package com.selfpractices2;

import java.util.Scanner;

public class MultiTable {
	public static void main(String[] args) {

		/*Write a program that prompts 
		 * the user to input a positive integer. 
		 * It should then print 
		 * the multiplication table of that number. 
		 * 
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a positive number");
		int number=input.nextInt();
		System.out.println("Multiplication Table of "+number);
//		for(int i =1;i<=10;i++) {
//			System.out.println(number+" x "+i+" = "+number*i);
//		}
		int i=0;
		while (i<=10) {
			System.out.println(number+" x "+i+" = "+number*i);
			i++;
		}
	}
}
