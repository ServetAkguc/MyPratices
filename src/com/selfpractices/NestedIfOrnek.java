package com.selfpractices;

public class NestedIfOrnek {
	public static void main(String[] args) {

		boolean isAllergy = true;
		boolean Orange = false;
		boolean apple = true;
		boolean kiwi = false;
		if (isAllergy) {
			System.out.println("You have allergy");
			if (Orange) {
				System.out.println("You have orange allergy");
			}
			if (apple) {
				System.out.println("You have apple allergy");
			}
			if (kiwi) {
				System.out.println("You have kiwi allergy");
			}

		} else {
			System.out.println("You are healthy");
		}

	}

}
