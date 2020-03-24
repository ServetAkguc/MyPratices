package com.selfpractices2;

import java.util.Scanner;

public class FactorialValue {

	public static void main(String[] args) {
		/*
		 *  Write a program to find the factorial 
		 *  value of any number entered through 
		 *  the keyboard
		 */
		
		Scanner scan=new Scanner(System.in);
		int num;
		int fact=1;//ex: 5; 5*4*3*2*1=120
		System.out.println("Please enter a positive number");
		num=scan.nextInt();
		for(int i=1; i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial : "+fact);
	}

}
