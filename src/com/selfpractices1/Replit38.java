package com.selfpractices1;

import java.util.Scanner;

public class Replit38 {
	public static void main(String []args){
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Is it weekend?");
		  String day=scan.nextLine();
		  
		  if (!day.equalsIgnoreCase("yes")){
		    System.out.println("Today you will be learning Manual testing");
		    }else {
		      System.out.println("Today you will be learning Java");
		    }
}
}
