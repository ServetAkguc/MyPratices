package com.selfpractices8;

public class Insan {

	int boy, kilo, yas;
	int maas;

	void yemek() {
		kilo++;
	}

	public static void main(String[] args) {
		Insan ali = new Insan();
		ali.boy = 180;
		ali.kilo = 80;
		ali.yas = 22;
		System.out.println("Ali'nin yasi " + ali.yas + " Ali'nin kilosu " + ali.kilo + " Ali'nin boyu " + ali.boy);

		ali.yemek();
		System.out.println("Ali'nin yasi " + ali.yas + " Ali'nin kilosu " + ali.kilo + " Ali'nin boyu " + ali.boy);

		Insan veli = new Insan();
		veli.boy = 170;
		veli.kilo = 55;
		veli.yas = 40;
		System.out
				.println("Veli'nin yasi " + veli.yas + " Veli'nin kilosu " + veli.kilo + " Veli'nin boyu " + veli.boy);

		veli.yemek();
		System.out
				.println("Veli'nin yasi " + veli.yas + " Veli'nin kilosu " + veli.kilo + " Veli'nin boyu " + veli.boy);

	}
}
