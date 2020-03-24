package com.selfpractices;
import java.util.Scanner;
public class Replit9 {
	public static void main(String[] args) {

		/*
		 * For you to do: 
		 * The variable "name" holds a String user input 
		 * Write a conditional statement starting on line 9 that does the following: 
		 * If name is equal to "Chen", 
		 * print "teacher" For any other input, print "student"
		 * 
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
	
		String name=input.nextLine();
		
		if (name.equalsIgnoreCase("Chen"))
			System.out.println("Teacher");
		else 
			System.out.println("Student");
	}
}
