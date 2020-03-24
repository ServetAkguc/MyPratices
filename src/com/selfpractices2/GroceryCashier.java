package com.selfpractices2;

import java.util.Scanner;

public class GroceryCashier {

	public static void main(String[] args) {

		/*
		 * The Grocery Cashier • A grocery cashier's job is to calculate the total costs
		 * of the items in the cart. – The cashier starts with a total of $0.00. – The
		 * cashier scans an item to get its price and adds the price to the total. – The
		 * cashier scans the next item to get its price and adds the price to the total.
		 * – … – When there are no more items to scan, the total is complete. • Notice
		 * that the cashier is performing the same operations on each item!
		 */
		Scanner input = new Scanner(System.in);
		double price = 0.0;
		double totalCosts = 0.0;

		for (int item = 1; item <= 10; item++) {
			if (item == 5) {
				
				break;
			}
			
			System.out.println("Please scan the item!");
			item = input.nextInt();
		}

	}
}
