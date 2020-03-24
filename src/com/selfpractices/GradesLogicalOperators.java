package com.selfpractices;

import java.util.Scanner;

public class GradesLogicalOperators {
	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		System.out.println("Please enter your mark");
//		int grade = input.nextInt();
//		if (grade >= 1 && grade <= 25) {
//	
//			System.out.println("Your grade is F");
//		} else if (grade > 25 && grade <= 45) {
//			System.out.println("Your grade is E");
//		} else if (grade > 45 && grade <= 50) {
//			System.out.println("Your grade is D ");
//		} else if (grade > 50 && grade <= 60) {
//			System.out.println("Your grade is C");
//		} else if (grade > 60 && grade <= 80) {
//			System.out.println("Your grade is B");
//		} else if (grade > 80) {
//			System.out.println("Your grade is E");
//		} else {
//			System.out.println("Please enter valid mark");
//		}
//
//	
		 Scanner scan;
			int mark;
			char grade = 0;

			scan = new Scanner(System.in);
			System.out.println("Please enter your mark");
			mark = scan.nextInt();
			if (mark > 0 && mark < 25) {
				grade = 'F';
			} else if (mark >= 25 && mark < 45) {
				grade = 'E';
			} else if (mark >= 45 && mark < 50) {
				grade = 'D';
			} else if (mark >= 50 && mark < 60) {
				grade = 'C';
			} else if (mark >= 60 && mark < 80) {
				grade = 'B';
			} else if (mark >= 80 && mark <= 100) {
				grade = 'A';
			} else {
				System.out.println("Please enter valid mark");
			}
			if (grade!=0){
			  System.out.println("Your grade is "+grade);
			}
	  }
	
	}

	