package com.selfpractices;

import java.util.Scanner;

public class TestingReplit {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please enter 3 distinct numbers");
//		int num1 = input.nextInt();
//		int num2 = input.nextInt();
//		int num3 = input.nextInt();
//		if (num1 > num2 && num1 > num3) {
//			System.out.println("The largest number is " + num1);
//		} else if (num2 > num1 && num2 > num3) {
//			System.out.println("The largest number is " + num2);
//		} else {
//			System.out.println("The largest number is " + num3);
//		}


				Scanner scan;
				int num4, num5, num6;
				int largest;

				scan = new Scanner(System.in);
				System.out.println("Please enter 3 distinct numbers");
				num4 = scan.nextInt();
				num5 = scan.nextInt();
				num6 = scan.nextInt();

				if (num4 >= num5) {
					if (num4 > num6) {
						largest = num4;
					} else {
						largest = num6;
					}
				} else {
					if (num5 >= num6) {
						largest = num5;
					} else {
						largest = num6;
					}
				}
				System.out.println("The largest number is " + largest);
			}
		}