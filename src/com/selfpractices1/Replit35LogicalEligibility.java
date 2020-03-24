package com.selfpractices1;

import java.util.Scanner;

public class Replit35LogicalEligibility {
	public static void main(String[] args) {
		/*
		 * Create a program that prompt user with question: "Do you need a loan?" If the
		 * result is true then prompt user with question: "What is your credit score?".
		 * Otherwise eligibility is "Unknown" Based on the score define users
		 * eligibility: if score is below 600 --> eligibility = "Not eligible" if score
		 * is between 600 and 700 inclusive --> eligibility = "Maybe eligible" if score
		 * is between 701 and 800 inclusive --> eligibility = "Eligible" if score is
		 * higher than any other previous values --> eligibility = "Definitely eligible"
		 * .
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Do you need a loan true/false?");
		boolean needLoan = input.nextBoolean();
		String eligibility;

		if (needLoan) {
			System.out.println("What is your credit score?");
			int score = input.nextInt();
			if (score <= 600) {
				eligibility = "Not eligible";
			} else if (score > 600 && score <= 700) {
				eligibility = "Maybe eligible";
			} else if (score > 700 && score <= 800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely eligible";
			}
		} else {
			eligibility = "unknown";
		}

		System.out.println("The eligibility is  " + eligibility);
	}

}
