package com.selfpractices9;

public class Replit112 {
	boolean evenOdd (int a, int b) {
		boolean flag =false;
		if (a%2==0 && b%2==0) {
			flag=true;
		} else {
			flag=false;
		}
		return flag;
	}
	
	
	
	
	public static void main(String[] args) {
		Replit112RB x= new Replit112RB ();
        boolean nums=x.evenOdd(5, 10);
		System.out.println(nums);
		
	}

}