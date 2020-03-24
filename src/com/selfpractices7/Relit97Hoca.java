package com.selfpractices7;

import java.util.Scanner;

public class Relit97Hoca {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
			    System.out.print("In:");
			    String givenString = inp.nextLine().replace(" ", "");
			   	//write your code below
			  
			    String reversedString="";
				
				for (int i=givenString.length()-1; i>=0; i--) {
					reversedString+=givenString.charAt(i);
				}

				boolean isPalindrome=false;
				
				if(givenString.equalsIgnoreCase(reversedString)) {
					isPalindrome=true;
				}
				
				System.out.println(isPalindrome);
	  }
	}

