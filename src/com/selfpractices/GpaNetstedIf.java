package com.selfpractices;

public class GpaNetstedIf {
	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 3.5;
		if (diploma) {
			System.out.println("Congratulations!!!Let's chech your gpa score");

			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("get a degree");
		}
		System.out.println("======================");
		
		double mortgageRate=4.6;
		int mortgagePrice=120000;
		 
		
		if (mortgageRate>4.5) {
			System.out.println("I won't buy a house ");
		}else {
			System.out.println("I will buy a house");
			if(mortgagePrice>200000) {
				System.out.println("Take a loan");
			}else {
				System.out.println("Pay cash");
			}
		}
	}

}
