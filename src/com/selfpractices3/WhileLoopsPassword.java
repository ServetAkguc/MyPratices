package com.selfpractices3;

import java.util.Scanner;

public class WhileLoopsPassword {

	public static void main(String[] args) {

		/*
		 * icu
		 * 
		 * initialization comparison/condition update
		 */
		System.out.println("Guess the password:");
		String password = "let me in";
		Scanner input = new Scanner(System.in);
		String guess=input.nextLine();
		
		while (!guess.equals(password)) {
			System.out.println("Guess the password:");
			guess=input.nextLine();
		}
		System.out.println("Congrats");
		input.close();
	}

}
