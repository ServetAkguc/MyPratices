package com.selfpractices11;

public class MaxLength134 {

	//find the longest String
	public static void main(String[] args) {
		String[] arr = { "hey", "yolo", "hi", "this is long" };
		System.out.println(maxLength(arr));
		// should print "this is long"
	}

	static String maxLength(String[] words) {
		int index = 0;
		int elementLength = words[0].length();
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > elementLength) {
				index = i;
				elementLength = words[i].length();
			}
		}
		return words[index];
	}
}