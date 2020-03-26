package com.selfpractices8;

public class LargerNoMethods {

	void numbers(int a, int b) {
		if (a > b) {
			System.out.println("a is larger than b");
		} else {
			System.out.println("b is larger than a");
		}
	}
	
	

	public static void main(String[] args) {
		LargerNoMethods num = new LargerNoMethods();
		num.numbers(2, 4);
	}

}
