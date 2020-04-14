package com.selfpractices11;

public class FinalKeyword {

	final int MIN=0;
	final int MAX=5;
	
	public static void main(String[] args) {
		//you cannot change final keyword,also known global variable
		FinalKeyword f =new FinalKeyword();
		System.out.println(f.MAX);
		
	}
}
