package com.selfpractices9;

public class Replit123Static {
	/*
	 * Create two methods: The first method should be a 
	 * non-static method that will print out the following 
	 * message: "Programming is amazing."
	 * The second method should be a static method that 
	 * will print out the following
	 * message: "Java is awesome."
	 */
	void displayMsg() {
		System.out.println("Programming is amazing.");
	}

	static void showMsg() {
		System.out.println("Java is awesome.");
	}

	public static void main(String[] args) {

		Replit123Static mm = new Replit123Static();
		mm.displayMsg();
		showMsg();
	}
}
