package com.selfpractices7;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "Hello2!  ";
		int length = str.length();
		System.out.println(length);

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.equalsIgnoreCase("hello2!  "));
		System.out.println(str.equalsIgnoreCase("hello2!"));

		System.out.println(str.startsWith("H"));
		System.out.println(str.endsWith(" "));

		boolean starts = str.toLowerCase().startsWith("he");
		System.out.println(starts);

		char fifthChar = str.charAt(4);
		System.out.println(fifthChar);

		char [] charArray=str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		String reverse="";
		for (int i=charArray.length-1;i>=0;i--) {
			reverse+=charArray[i];
			//System.out.print(charArray[i]);
		}
		System.out.println("Reverse word of Hello is "+reverse);
	
		int index=str.indexOf("llo");
		System.out.println(index);
		
		String example="Something inside here";
		int index2=example.indexOf("e",10);
		System.out.println(index2);
	
	
	
	}
}
