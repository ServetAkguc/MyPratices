package com.selfpractices6;

public class ReverseSunday {

	public static void main(String[] args) {
		String day = "Sunday is good";
		char reverseLetter;
		for (int i = day.length() - 1; i >= 0; i--) {
			reverseLetter = day.charAt(i);
			System.out.print(reverseLetter+" ");
		}

	}
}
