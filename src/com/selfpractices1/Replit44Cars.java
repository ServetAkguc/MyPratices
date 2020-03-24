package com.selfpractices1;

import java.util.Scanner;

public class Replit44Cars {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String carModel = input.nextLine();
		String carOrigin = null;

		switch (carModel) {
		case "BMW":
			carOrigin = "german car";
			break;
		case "Toyota":
			carOrigin = "japanese car";
			break;
		case "Maserati":
			carOrigin = "italian car";
			break;
		default:
			carOrigin = "unknown";
			break;
			}
		if (carOrigin!= null) {
			System.out.println("Your favorite car is " + carOrigin);
		}
	}

}
