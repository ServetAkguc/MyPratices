package com.selfpractices9;

 class T {

	int sumEvenToX(int x) {
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		T rakam = new T();
		System.out.println(rakam.sumEvenToX(5));
		System.out.println(rakam.sumEvenToX(8));

	}

}
