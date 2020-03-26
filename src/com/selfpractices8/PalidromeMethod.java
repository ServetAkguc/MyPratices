package com.selfpractices8;

public class PalidromeMethod {

	void palindrome(String word) {
		String reverse = "";
		char[] array = word.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			reverse += array[i];

		}
		System.out.println(reverse);

		if (reverse.equalsIgnoreCase(word)) {
			System.out.println("Word is palindrome");
		} else {
			System.out.println("Word is NOT palindrome");
		}
	}

	public static void main(String[] args) {
		PalidromeMethod obj = new PalidromeMethod();
		obj.palindrome("servet");
	}
}
