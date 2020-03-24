package com.selfpractices1;

import java.util.Scanner;

public class InstructorName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String name = sc.nextLine();
		String subject = null;

		switch (name) {
		case "Shiva":
			subject = "Java";
			break;
		case "Sandish":
			subject = "SDLC";
			break;
		case "Weqas":
			subject = "Selenium";
			break;
		case "Asel":
			subject = "every";
			break;

		default:
			System.out.println("Invalid instructor selected");

		}

		if (subject != null) {
			System.out.println("Will take care of " + subject + " Assignment");
		}

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter name of the instructor");
//		String name = scan.nextLine();
//		if (name.equalsIgnoreCase("Shiva")) {
//			System.out.println("Will take care of Java Assignment");
//		} else if (name.equalsIgnoreCase("Sandish")) {
//			System.out.println("Will take care of SDLC Assignment");
//		} else if (name.equalsIgnoreCase("Weqas")) {
//			System.out.println("Will take care of Selenium Assignment");
//		} else if (name.equalsIgnoreCase("Asel")) {
//			System.out.println("Will take care of every Assignment");
//		} else {
//			System.out.println(" Invalid instructor selected");
//		}

	}

}
