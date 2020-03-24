package com.selfpractices6;

public class Substring {
	public static void main(String[]args) {
		
		System.out.println("===substring() FUNCTION===");
		
		String str="Today is a rainy day";
		//rainy day
		//str=str.substring(11);
		System.out.println(str);
		//Today
		String str2=str.substring(0,5);
		System.out.println(str2);
		
		String str1=str.substring(11,16);
		System.out.println(str1);
	}

}
