package com.selfpractices;

public class Replit2 {
	public static void main(String[] args) {
		/*
		 * For you do to: 1. Declare 2 numbers and assign values 200 and 100
		 * respectively. 2. First, add numbers, then subtract, third multiply, forth
		 * divide. 3. Please use variables to print the values of each operation result
		 * on a separate line.
		 * 
		 * Output: 300 100 20000 2
		 * 
		 */

		int num1 = 200;
		int num2 = 100;
		int add = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);

		System.out.println("=======replit11=======");

		/*
		 * For you to do: Write a program to print the perimeter and area of a rectangle
		 * with width = 5 and height = 8.
		 * 
		 * Output: “The perimeter of a rectangle with width __ and height __ is equals
		 * to __ and the area equals to __”
		 * 
		 */

		int width = 5;
		int height = 8;
		int perimeter = 2 * (width + height);
		int area = width * height;

		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equals to " + perimeter + " and the area equals to " + area);

		System.out.println("=============replit12=============");

		/*
		 * For you to do: 1. Add num1 and num2 2. Divide the result by num3 3. Subtract
		 * num4 from that result
		 * 
		 * Instructions: Please use variables to assign the result of arithmetic
		 * operations
		 * 
		 * Output: "The result of arithmetic operations is equal to ___"
		 * 
		 */
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;

		int result1 = (a + b) / 3;
		int result2 = (a + b) / 3 - d;
		System.out.println("The result of arithmetic operations is equal to " + result1);
		System.out.println("The result of arithmetic operations is equal to " + result2);
	}

}
