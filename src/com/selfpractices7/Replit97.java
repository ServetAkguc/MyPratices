package com.selfpractices7;

import java.util.Scanner;

public class Replit97 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String givenString = inp.nextLine().replaceAll(" ", "");
		// write your code below
		char[] charArray = givenString.toCharArray();

		String reverse = "";

		for (int i = givenString.length() - 1; i >= 0; i--) {

			reverse += charArray[i];
		}

		if (!givenString.equalsIgnoreCase(reverse)) {
			System.out.print("false");
		} else {
			System.out.println("true");
		}

	}

}
