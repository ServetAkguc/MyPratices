package com.selfpractices9;

public class Replit125 {
	static String mixString(String s1,String s2){
		  String servet="";
		  for(int i=0;i<s1.length();i++){
		    servet=servet+s1.charAt(i)+s2.charAt(i);
		  }
		
		  return servet;
		}
		
		//test case below (dont change):
		public static void main(String[] args){
		  String firstValue = mixString("12345","abcde"); 
			System.out.println(firstValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
			
			
		}
	}