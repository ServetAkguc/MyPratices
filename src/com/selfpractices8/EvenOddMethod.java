package com.selfpractices8;

public class EvenOddMethod {

	void numbers(int a) {
		if(a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
	public static void main(String[] args) {
		EvenOddMethod num=new EvenOddMethod();
		num.numbers(5);
	}
}
