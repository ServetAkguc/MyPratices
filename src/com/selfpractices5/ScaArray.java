package com.selfpractices5;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ScaArray {
	public static void main(String[] args) {

		int[] grades=new int[10];
		
		Scanner input= new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			int x=input.nextInt();
			grades[i]=x;
		}
		System.out.println(Arrays.toString(grades));
		
	}
}
