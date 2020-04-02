package com.selfpractices11;

public class Replit142ShoppingStore {
	String item;
	double price;
	double quantity;
	
	public Replit142ShoppingStore(String item, double price, double quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	

	}

	double itemTotalPrice() {
		double total = this.price * this.quantity;
		System.out.println(this.item+" Total Value "+total);
		return total;
		
	}

	public static void main(String[] args) {
		Replit142ShoppingStore blanket = new Replit142ShoppingStore("Blankett", 49.99, 2);
		
		Replit142ShoppingStore mattress = new Replit142ShoppingStore("Mattress", 219.59, 2);
		
		double total=blanket.itemTotalPrice();
		double total1=mattress.itemTotalPrice();
		double sumPurchase=total+total1;
		System.out.println("You purchased "+sumPurchase+" Today ");
		

	}

}
