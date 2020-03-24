package com.selfpractices;

	import java.util.Scanner;
	
public class AnotherScanner {

	public static void main(String[]args) {
		//capture two number from a user
		//compare number and identify which is larger
		Scanner input= new Scanner (System.in);
		System.out.println("Please enter first number");
		int num1=input.nextInt();
		
		System.out.println("Please enter a second number");
		int num2 =input.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}else if(num2>num1){
			System.out.println(num2+" is larger than "+num1);
		}else {
			System.out.println(num1+" is equal "+num2);
		}
	
	}
}
