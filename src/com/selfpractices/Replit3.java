package com.selfpractices;

public class Replit3 {
	public static void main(String[] args) {

		/*
		 * For you to do: Create an int variable called myNumber. Set it equal to any
		 * number other than 0. We will refer to myNumber as the original number from
		 * now on. Create an int variable called stepOne. Set it equal to the original
		 * number (myNumber) multiplied by itself. Create an int variable called
		 * stepTwo. Set it equal to the previous result (stepOne) plus the original
		 * number (myNumber). Create an int variable called stepThree. Set it equal to
		 * the previous result (stepTwo)divided by the original number. Create an int
		 * variable called stepFour. Set it equal to the previous result (stepThree)
		 * plus 17. Create an int variable called stepFive. Set it equal to the previous
		 * result (stepFour) minus the original number. Create an int variable called
		 * stepSix.Set it equal to the previous result (stepFive) divided by 6. Let's
		 * print out the value of the last step as: "The magic number is _ !" Now try
		 * running your code! What number is printed to the console? Now, go back to
		 * your code and change myNumber to any other integer. Run your program again.
		 * Is the output the same? It's math magic!
		 * 
		 * Output: "The magic number is _!"
		 * 
		 */
		int myNumber = 9999;
		int stepOne = myNumber * myNumber;
		int stepTwo = stepOne + myNumber;
		int stepThree = stepTwo / myNumber;
		int stepFour = stepThree + 17;
		int stepFive = stepFour - myNumber;
		int stepSix = stepFive / 6;

		System.out.println("The magic number is " + stepSix);

		System.out.println("==================Replit14=============");

		/*
		 * For you to do Add the values of num1 and num2 and then subtract num3 from the
		 * result and store it in result1 variable Multiply num4 and num5 together and
		 * then divide num6 from the result and store it in result2 variable Print the
		 * following statement: _______ modded by _______ is ______
		 * 
		 */

		int num1 = 10;
		int num2 = 12;
		int num3 = 5;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;

		int result1 = (num1 + num2) - num3;
		int result2 = (num4 * num5) / num6;
		int blank3 = result2 % result1;

		System.out.println(result2 + " modded by " + result1 + " is " + blank3);

		System.out.println("================replit15=====================");

		/*
		 * Print the results of 14 mod 2. expected result =0
		 */
		int x = 14;
		int y = 2;
		int result4 = x % y;
		System.out.println(result4);

		/*
		 * For you to do: Print the result of 29 mod 4
		 * 
		 * Output: 1
		 */
		System.out.println("================replit16=====================");

		int a = 29;
		int b = 4;
		int result5 = a % b;
		System.out.println(result5);

		System.out.println("================replit17=====================");

		/*
		 * For you to do: Print result of -21 mod 4?
		 * 
		 * Expected Output: -1
		 */

		int result6 = -21 % 4;
		System.out.println(result6);

		System.out.println("================replit17=====================");

		/*
		 * For you to do: Write a program to convert double 500.4444 into long.
		 * 
		 * Expected Output: 500
		 * 
		 */

		double s = 500.4444;
		long r = (long) s;
		System.out.println(r);

		System.out.println("=====================================");

		int pound = 20;
		double kilograms = pound * 0.453592;

		System.out.println(kilograms);

		System.out.println("================replit18=====================");

		/*
		 * For you to do: Write a program to convert double 100.50 into int type
		 * 
		 * Expected Output: 100
		 * 
		 */

		double g = 100.50;
		int h = (int) g;
		System.out.println(h);

		System.out.println("================replit19=====================");

		
	}
}
