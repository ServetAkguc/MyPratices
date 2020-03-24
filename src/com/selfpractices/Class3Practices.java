package com.selfpractices;

public class Class3Practices {

	public static void main(String[] args) {

		int num = 100;
		num = num + 1000;
		System.out.println(num);
		int mod = num % 2;
		System.out.println(mod);

		System.out.println("-------------");

		int a = 10;
		int b = 20;
		String x = "Hello";
		String y = "Bye";
		System.out.println(a + b + x + y);
		System.out.println(a + x + b + y);
		System.out.println(x + y + a + b);
		System.out.println(x + y + (a + b));
		System.out.println(a + "" + b + x + y);

		System.out.println("-------------------");

		// compound shorthand assignment operators
		int num1 = 200;
		num1 = num1 + 300;
		System.out.println(num1);// 500
		num1 = num1 - 100;
		System.out.println(num1);// 400
		num1 -= 100;
		System.out.println(num1);// 300
		num1 += 50;
		System.out.println(num1);// 350
		num1 /= 7;
		System.out.println(num1);// 50
		num1 *= 10;
		System.out.println(num1);// 500
		num1 %= 5;
		System.out.println(num1);// 0

		System.out.println("-------------------");

		// casting in Java is a conversion of one type to another type
		/*
		 * 2 types of casting(converting) 1. widening (implicit) automatically
		 * byte<short<int<long<float<double
		 * 
		 * 2.narrowing (explicit) manually double-->float-->long-->int-->short-->byte
		 *
		 */

		// widening happens implicitly
		double d = 10;
		System.out.println(d);

		// narrowing , happens explicitly
		int i = (int) 10.99;
		System.out.println(i);

		// byte -128 to 127
		byte b1 = (byte) 1284;
		System.out.println(b1);

		// int i =10.99; compile time error aying
		// type mismatch cannot convert double to int

		System.out.println("-------------------------");

		int s = 10;
		int r = 20;
		System.out.println(s > r);// false
		System.out.println(s < r);// true
		System.out.println(s == r);// false
		System.out.println(s != r);// true

		System.out.println("---------------------------");

		double n = 900.99;
		double m = 100.99;
		boolean result = n > m;// true
		boolean result1 = n == m;// false
		boolean result2 = n != m;// true
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);

		System.out.println("=========================");

	
		
	
	
	}

}
