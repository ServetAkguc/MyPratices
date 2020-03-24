package com.selfpractices1;

import java.util.Scanner;

public class Replit45Days {
	
	public static void main(String[]args){
		
	    Scanner input= new Scanner(System.in);
	    System.out.println("Input a number between 1-7");
	    int number=input.nextInt();
	    String day=null;
	    
	    switch (number){
	      case 1:
	        day="Monday";
	        break;
	         case 2:
	        day="Tuesday";
	        break;
	         case 3:
	        day="Wednesday";
	        break;
	         case 4:
	        day="Thursday";
	        break;
	         case 5:
	        day="Friday";
	        break;
	         case 6:
	        day="Saturday";
	        break;
	         case 7:
	        day="Sunday";
	        break;
	         default:
	        day="Invalid";
	        break;
	        
	    }
	    System.out.println(day);
	  }

}