package com.selfpractices6;

public class SwapString {

	public static void main(String[] args) {
		//how to swap string
		String a="Hello";
		String b="World";
		System.out.println("===The value a and b  Before swapping === ");
		System.out.println("The value of a is : "+a);
		System.out.println("The value of b is : "+b);
		
		//1.step append a and b
		a=a+b;//HelloWorld
		
		//2.Step Store initial String a in String b
		b=a.substring(0,a.length()-b.length());
		
		//3.step Store initial String b in String a
		a=a.substring(b.length());
		
		System.out.println("===The value a and b After swapping===");

		System.out.println("The value of a is : "+a);
		System.out.println("The value of b is : "+b);
	}

}
