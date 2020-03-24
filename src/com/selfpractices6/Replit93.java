package com.selfpractices6;

import java.util.Scanner;

public class Replit93 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any programming language");
		String language = sc.nextLine();
//
//		if (language.equals("Java")) {
//			System.out.println("Java is a programming language");
//
//		}
//		else if (language.equals("C")) {
//			System.out.println("C is a procedural programming language");
//		}
//		else if (language.equals("C++")) {
//			System.out.println("C++ is a middle-level programming language");
//		}
//
//		else {
//			System.out.println("Doesn't match any programming language");
//		}

		String message;
		switch (language.toUpperCase()) {//????upperCase upper case te calisiyor
		case "JAVA":					//???lowerCase lowercase te calisiyor
			message = "Java is";
			break;
		case "C":
			message = "C is a procedural";
			break;
		case "C++":
			message ="C++ is a middle-level";
			break;
		default:
			message ="Doesn't match any";
			break;
		}
		System.out.println(message+" programming language");
	}
}
