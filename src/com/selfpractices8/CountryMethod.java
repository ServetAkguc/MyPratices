package com.selfpractices8;

public class CountryMethod {

	void sayHello(String country) {
		switch (country.toLowerCase()) {
		case "russia":
			System.out.println("Privet");
			break;
		case "usa":
			System.out.println("Hello");
			break;
		case "turkey":
			System.out.println("Merhaba");
			break;
		case "egypt":
			System.out.println("Selam");
			break;
		default:
			System.out.println("invalid data");
		}

	}

	public static void main(String[] args) {
		CountryMethod obj = new CountryMethod();

		obj.sayHello("Turkey");
	}
}
