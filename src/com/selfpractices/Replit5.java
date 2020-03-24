package com.selfpractices;

import java.util.Scanner;

public class Replit5 {
	public static void main(String[] args) {
		/*
		 * For you to do: Write a program to take user name, age and mobile number
		 * 
		 * First Output: "Enter your name" Second Output: "Enter your mobile number"
		 * (please use xxx-xxx-xxxx format) Third Output: "Enter your age"
		 * 
		 * Example Output: Enter your name Enter your mobile number Enter your age Your
		 * name is Weqas, your age is 45 and your mobile number is 571-339-9999
		 * 
		 * 
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=input.nextLine();
		System.out.println("Please enter your mobile number");
		String phone=input.nextLine();
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		System.out.println("Your age is "+name+" your age is "+age+" your phone number is "+phone);
		
		
	}

}
