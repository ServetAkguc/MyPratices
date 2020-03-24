package com.selfpractices;

public class IfElse {

	public static void main(String[] args) {

		System.out.println("Start Coding");

		int num = 178;
		if (num > 1000) {
			System.out.println("My number is large");
		}

		System.out.println("End of the program");

		System.out.println("======================");

		int expectedHours = 15;
		int actualHours = 24;
		// if actual is more than expected ===>you will love Java
		boolean result = expectedHours <= actualHours;
		if (result) {

			System.out.println("I will love Java");
		} else {// otherwise
			System.out.println("I won't like Java");
		}
		System.out.println("============================");

		double myBudget = 10000;
		double carPrice = 12000;
		boolean x = myBudget > carPrice;
		if (x) {
			System.out.println("I will buy this car");
			System.out.println("I will be happy");
		} else {
			System.out.println("I won't buy this car");
			System.out.println("I will be motivated");
		}
		System.out.println("==========================");

		double a = 29.99;
		double b = 29.99;
		boolean s = a > b;

		if (s) {
			System.out.println("a is larger than b");
		} else if (a == b) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("b is larger than a");
		}
		System.out.println("==================");

		int temperature = 12;
		if (temperature < 32) {
			System.out.println("Water will freeze");
		} else {
			System.out.println("Water will not freeze");
		}
		// if always has to be a boolean expression
		System.out.println("///////////////////////////////");

		// declare a day
		int day = 12;
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid");
		}
		System.out.println("====================");

		int month = 12;
		if (month == 1)
			System.out.println("January");
		else if (month == 2)
			System.out.println("February");
		else if (month == 3)
			System.out.println("March");
		else if (month == 4)
			System.out.println("April");
		else if (month == 5)
			System.out.println("May");
		else if (month == 6)
			System.out.println("June");
		else if (month == 7)
			System.out.println("July");
		else if (month == 8)
			System.out.println("August");
		else if (month == 9)
			System.out.println("September");
		else if (month == 10)
			System.out.println("October");
		else if (month == 11)
			System.out.println("November");
		else if (month == 12)
			System.out.println("December");
		else
			System.out.println("Invalid");

		System.out.println("======================");

		int weather = -10;
		if (weather > 0)
			System.out.println("weather is positive");
		else if (weather == 0)
			System.out.println("weather is neatrul");
		else
			System.out.println("weather is negative");

		System.out.println("========================");

		int number = 9;
		if (number % 2 == 0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
		System.out.println("======================");

	}

}
