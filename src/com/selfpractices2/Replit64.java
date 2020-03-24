package com.selfpractices2;

import java.util.Scanner;

public class Replit64 {
	/*
	 * You should input: int end;
	 * 
	 * Write a for loop that will print out a series of numbers starting at 0 and
	 * ending at the doubled value of end (value must be taken from a user),
	 * exclusive. Each number should be on the same line, separated by a space.
	 */
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.print("int : ");
		int end;
		end=input.nextInt();

		for (int i =0; i <end*2;i++ ) {
			System.out.print(i + " ");	
		
		}
		
		
	}
	

}
