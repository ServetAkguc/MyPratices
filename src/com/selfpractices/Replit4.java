package com.selfpractices;

import java.util.Scanner;

public class Replit4 {
	public static void main(String[] args) {
		/*
		 * For you to do: Write a program that takes user's first name and surname and
		 * prints in console Instruct the user to enter first name:
		 * "Please Enter First Name" Capture the first name Instruct the user to enter
		 * surname:"Please Enter Surname" Capture surname Print first name and surname
		 * 
		 * Final Output: Example: Please Enter First Name Please Enter Surname Cindy
		 * Crawford
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first name");
		String name = input.nextLine();
		System.out.println("Please enter last name");
		String lastName = input.nextLine();
		System.out.println(name + " " + lastName);

		System.out.println("===============replit21===============");

		/*
		 * For you to do: Write a program that asks the user's age: "Enter your age  "
		 * Then display it by adding 10 (i.e age + 10) in your final output.
		 * 
		 * Example Output: Enter your age 30 Your age after 10 years is 40
		 * 
		 * 
		 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age =scan.nextInt();
		System.out.println("Your age after 10 years is "+(age+10));
	
	}
}
