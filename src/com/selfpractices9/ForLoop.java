package com.selfpractices9;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 7; i>0; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		for (int i = 2; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}