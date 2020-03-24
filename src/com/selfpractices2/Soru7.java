package com.selfpractices2;

import java.util.Scanner;

public class Soru7 {
	
	public static void main(String[] args) {


	/*Write a program that reads a set of integers, 
	 * and then prints the sum of the even and odd integers.
	 */
		Scanner input=new Scanner(System.in);
		
		int num1=0;
		char choice;
		int sumEvens=0;
		int sumOdds=0;
		do {
			System.out.println("Please enter number");
			num1=input.nextInt();
			if(num1%2==0) {
				sumEvens+=num1;
			}else {
				sumOdds+=num1;
			}
			System.out.print("Do you want to continue y/n? ");
            choice = input.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Sum of even numbers: " + sumEvens);
        System.out.println("Sum of odd numbers: " + sumOdds);
	}
}
