package com.selfpractices8;

public class Calculator {

	void add(int a,int b) {
		System.out.println(a+b);
	}
	void sub(int a,int b) {
		System.out.println(a-b);
	}
	void mult(int a,int b) {
		System.out.println(a*b);
	}
	void div(double a,double b){
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add(10,20);
		calc.sub(29,19);
		calc.mult(10,2);
		calc.div(20.8,1);
		
		calc.add(109,290);
		calc.sub(209,109);
		
		
	}
}
