package com.selfpractices11;

public class CarObjectsReplit141 {

	  String model; 
	  double price; 
	  double quantity; 
	  
	  public CarObjectsReplit141(String model, double price, double quantity){
	    this.model = model; 
	    this.price = price; 
	    this.quantity = quantity; 
	  }
	  
	  public void carStockValue(){
	    
	    double stockValue = this.price * this.quantity; 
	    
	    System.out.println(model + " Stock Value " + stockValue);
	  }

	  public static void main(String[] args) {
		  CarObjectsReplit141 toyotaCar = new CarObjectsReplit141("Toyota 2019", 25000,100); 
		    toyotaCar.carStockValue(); 
		    
		    CarObjectsReplit141 bmwCar = new CarObjectsReplit141("BMW 2019", 65298,10); 
		    bmwCar.carStockValue();
		  }
}