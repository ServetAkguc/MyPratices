package com.selfpractices9;

public class Replit118Variables {
	String countryName;
	String capital;
	int size;

	void displayDetails() {
		System.out.println("The capital of " + countryName + " is " + capital + " and population is " + size);
	}

	public static void main(String[] args) {
		Replit118Variables country1 = new Replit118Variables();
		country1.countryName = "USA";
		country1.capital = "Washington DC";
		country1.size = 330000000;
		country1.displayDetails();

		Replit118Variables country2 = new Replit118Variables();
		country2.countryName = "Kazakhstan";
		country2.capital = "Astana";
		country2.size = 18500000;
		country2.displayDetails();


	}

}