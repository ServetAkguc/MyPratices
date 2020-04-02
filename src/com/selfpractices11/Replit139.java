package com.selfpractices11;

public class Replit139 {
	public static void main(String[] args) {
		Dog.dogBreed = "Mutt";
		Dog dog = new Dog();
		dog.dogName = "Tarzan";
		dog.dogWeight = 50.0;

		Dog dog1 = new Dog();
		dog1.dogName = "Lucy";
		dog1.dogWeight = 10.0;

		System.out.println(dog.dogName + " " + Dog.dogBreed + " " + dog.dogWeight);
		System.out.println(dog1.dogName + " " + Dog.dogBreed + " " + dog1.dogWeight);

	}

	public static class Dog {
		String dogName;
		double dogWeight;
		static String dogBreed = "Mutt";

	}
}