package com.selfpractices10;

public class ReturnStatement {

	public static void main(String[] args) {
		String shouting=caps("Why are you reading my diary mom?");
		System.out.println(shouting);
		printAMessage();
		//int sum=add(5,4);
		System.out.println(add(8,4));
	}
	public static void printAMessage() {
		System.out.println("This is out first method!");
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static String caps(String s) {
		return s.toUpperCase();
		
	}
}
