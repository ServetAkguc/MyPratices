package com.selfpractices3;

import java.util.Scanner;

public class DoWhilePassword {

	public static void main(String[] args) {
		Scanner input;
		String password = "let me in";
		String guess;
		do{
			input = new Scanner(System.in);
			System.out.println("Guess the password:");
			guess=input.nextLine();
			
		
		}while (!guess.equals(password));
		System.out.println("Congrats");
		input.close();
	}

}
