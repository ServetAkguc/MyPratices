package com.selfpractices4;

public class AliDSoru {
	public static void main(String[] args) {
		// does the animal breathe air
		// if yes does the animal lay eggs. if no fish
		// does the animal lay eggs.if yes bird if no mammal
		boolean breath = true;
		if (breath) {
			System.out.println("does the animal lay eggs?");
			boolean eggs =false;
			if (eggs) {
				System.out.println("it is a bird");
			} else {
				System.out.println("it is mammal");
			}
		} else {
			System.out.println("It is fish");
		}
	}
}
