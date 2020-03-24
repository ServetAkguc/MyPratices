package com.selfpractices6;

import java.util.Scanner;

public class HalfofEachName {

	public static void main(String[] args) {

		/*
		 * Write a program that reads two people’s first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
		 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY
		 * 
		 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
		 * girl Suggested baby name: MAIEL
		 */
		
		 Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter your dad's name");
		String dadName = scan.next();
		dadName = dadName.substring(dadName.length() / 2);
		System.out.println("Enter your mom's name");
		String momName = scan.next();
		momName = momName.substring(momName.length() / 2);
		System.out.println("Are you expecting bor or girl?");
		String gender = scan.next();

		int half1 = dadName.length() / 2;
		int half2 = momName.length() / 2;
		String SuggestedBName;
		if (gender.equals("boy")) {
			SuggestedBName=momName.substring(0,half2)+dadName.substring(half1);
			System.out.println(SuggestedBName);
		}
		else if (gender.equals("girl")) {
			SuggestedBName = dadName.substring(0, half1) + momName.substring(half2);
			System.out.println(SuggestedBName);
		}
		
		  /*Scanner scan=new Scanner(System.in);
		  System.out.println("What is Mom's first name"); 
		  String name1=scan.nextLine();
		  
		  System.out.println("What is Dad's first name"); 
		  String name2=scan.nextLine();
		  
		  System.out.println("Boy or Girl"); 
		  String babyName=scan.nextLine(); 
		  String SuggestedBName=null; 
		  int half1=name1.length()/2; 
		  int half2=name2.length()/2;
		  if(babyName.equalsIgnoreCase("Girl")) {
		  SuggestedBName=name1.substring(0,half1)+name2.substring(half2);
		  System.out.println(SuggestedBName);
		  
		  }else if(babyName.equalsIgnoreCase("Boy")) {
		  SuggestedBName=name2.substring(0,half2)+name1.substring(half1);
		  System.out.println(SuggestedBName); }
		 */
	}
}
