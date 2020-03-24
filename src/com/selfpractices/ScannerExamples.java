package com.selfpractices;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		// bring Scanner clas into a program
		// System.in===>identifies keyboard

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		// instruct user of what program expects
		String name = scan.nextLine();
		//capture line of Strings from a user
		System.out.println("My name is " + name);
		//capture a number from a user
		System.out.println("How old are you?");
		int age = scan.nextInt();

		System.out.println("Your name is " + name + " your age is " + age);

	}
}
