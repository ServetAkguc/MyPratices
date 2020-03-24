package com.selfpractices8;

public class Methods {

	void sayWelcome() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Welcome");
		}
	}

	// create method that will say any word #number
	// of times
	void sayAnything(String word, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}

	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.sayWelcome();
		obj.sayAnything("Hello", 3);
		obj.sayAnything("Bye", 2);

		IsRaining rain = new IsRaining();
		rain.isItRaining(false);
		rain.isItRaining(true);

	}

}
