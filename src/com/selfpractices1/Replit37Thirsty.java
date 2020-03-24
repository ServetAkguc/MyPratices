package com.selfpractices1;

import java.util.Scanner;

public class Replit37Thirsty {

	public static void main(String[] args) {
		/*
		 * Take 2 boolean inputs from a user:
		 * 
		 * "Are you thirsty?" 
		 * "Are you sleepy?"
		 * 
		 * If user is thirsty and not sleepy--> drink=Water 
		 * If user is thirsty and sleepy--> drink=Coffee 
		 * If user is not thirsty and sleepy --> drink=Tea
		 * Otherwise drink="Nothing"
		 * 
		 * Output: "Looks like you need to drink __
		 */
		Scanner scan;
		boolean sleepy;
		boolean thirsty;
		String drink;
		
		scan = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		thirsty=scan.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy=scan.nextBoolean();
		
		if (thirsty && !sleepy) {
			drink="Water";
		}else if (thirsty && sleepy){
			drink="Coffee";
		}else if (!thirsty && sleepy){
			drink="Tea";
		}else {
			drink="Nothing";
		}
		System.out.println("Looks like you need to drink "+drink);
	}
}