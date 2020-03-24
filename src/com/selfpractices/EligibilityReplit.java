package com.selfpractices;

import java.util.Scanner;

public class EligibilityReplit {
	 public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Do you need a loan?");
			boolean needLoan = true;
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
			}else{
			  	eligibility ="unknown";
			}

				System.out.println("The eligibility is  " + eligibility);
			}

		}
	
