package com.selfpractices9;

public class Insan {

	int boy,kilo,yas;
	void yemek(){
		kilo++;
	}
	public static void main(String[] args) {
		Insan servet=new Insan();
		servet.boy=170;
		servet.kilo=95;
		servet.yas=38;
		System.out.println(" Servet'in boyu "+servet.boy+" kilosu "+servet.kilo+" yasi "+servet.yas);
	}
}
