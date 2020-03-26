package com.selfpractices9;

public class Replit113 {
	public int sumEvenToX(int x) {

		int sum = 0;
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Replit113 obj = new Replit113();
		System.out.println(obj.sumEvenToX(5)); // 6
		System.out.println(obj.sumEvenToX(8)); // 20
	}
}