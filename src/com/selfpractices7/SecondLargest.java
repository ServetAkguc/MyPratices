package com.selfpractices7;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array
		// Max and min in the array

		int[] numbers = { 32, 61, 16, 89, 74, 25 };

		// 1st way
		Arrays.sort(numbers);
		System.out.println("Smallest number is " + numbers[0]);
		System.out.println("Biggest number is " + numbers[numbers.length - 1]);
		System.out.println("Second biggest number is " + numbers[numbers.length - 2]);

		System.out.println("===============================");
		// 2nd Way
		int[] numbers2 = { 32, 74, 16, 89, 61, 25 };
		int smallest = numbers2[0];
		int largest = numbers2[0];
		int largest2 = numbers2[0];
		
		for(int i=0;i<numbers2.length;i++) {
			int element=numbers2[i];
			if(element>largest) {
				largest=element;
			}else if(element>largest2) {
				largest2=element;
			}
			if(element<smallest) {
				smallest=element;
			}
		}
		System.out.println("Smallest number is " + smallest);
		System.out.println("Biggest number is " + largest);
		System.out.println("Smallest number is " + largest2);
		//System.out.println("Second biggest number is " + numbers2[numbers.length - 2]);


	}

}
