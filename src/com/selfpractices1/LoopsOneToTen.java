package com.selfpractices1;

public class LoopsOneToTen {
	public static void main(String[] args) {
		int num = 1;
		while (num <= 10) {

			System.out.println(num);

			num++;
		}
		System.out.println("============");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("============");
		System.out.println("============");
		
		int num1=1;
		do {
			System.out.print(num1+" ");
			num1++;
		}while(num1<=10);
	}

}