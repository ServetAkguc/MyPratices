package com.selfpractices7;

public class Replit95 {
	public static void main(String[] args) {
		String given = "Hello Syntax friends";
		String newString = "Welcome Syntax family";
		given = given + newString;// Hello Syntax friendsWelcome Syntax family
		newString = given.substring(0, given.length() - newString.length());
		given = given.substring(newString.length());
		System.out.println(given);

		String given1 = "Hello Syntax friends";

		given1 = given1.replace("Hello", "Welcome").replace("friends", "family");

		System.out.println(given1);
	}

}
