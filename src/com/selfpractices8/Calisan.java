package com.selfpractices8;

public class Calisan extends Insan {
	int maas;

	void zam(int oran) {
		maas += maas * oran / 100;

	}
	public static void main(String[] args) {
		Calisan ali= new Calisan();
		ali.boy=180;
		ali.kilo=80;
		ali.yas=22;
		System.out.println("Ali'nin yasi "+ali.yas+" Ali'nin kilosu "
		+ali.kilo+" Ali'nin boyu "+ali.boy);
		
		ali.yemek();
		System.out.println("Ali'nin yasi "+ali.yas+" Ali'nin kilosu "
				+ali.kilo+" Ali'nin boyu "+ali.boy);
		
		Calisan veli= new Calisan();
		veli.boy=170;
		veli.kilo=55;
		veli.yas=40;
		System.out.println("Veli'nin yasi "+veli.yas+" Veli'nin kilosu "
				+veli.kilo+" Veli'nin boyu "+veli.boy);
		
		veli.yemek();
		System.out.println("Veli'nin yasi "+veli.yas+" Veli'nin kilosu "
				+veli.kilo+" Veli'nin boyu "+veli.boy);
		
		
		ali.maas=100;
		ali.zam(20);
		System.out.println("Ali'nin zamli maasi: "+ali.maas);
		ali.zam(30);
		System.out.println("Ali'nin zamli maasi: "+ali.maas);
		
		
	}
}
