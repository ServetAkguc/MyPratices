package com.selfpractices4;

import java.util.Scanner;

public class Replit65 {
	 public static void main(String[] args) {
		 
		    Scanner input=new Scanner(System.in);
		    System.out.println("Please enter a number");
		    int x=input.nextInt();
		    System.out.print("In:");
		    
		    for(int i=x;i>=0;i--){
		    	if(i==x) {
		    		continue;
		    	}
		      System.out.print(i+" ");
		    }
		    
		    
		  }
		}

