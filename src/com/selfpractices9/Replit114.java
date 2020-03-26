package com.selfpractices9;

public class Replit114 {
	
	String spaceOut (String str) {
				
				String newString="";
				
				for(int i=0; i<str.length(); i++ ) {
					newString=newString+str.charAt(i)+" ";
				}
				
				return newString;
			}
	 public static void main(String[] args) {
		 Replit114 obj=new Replit114();
				System.out.println(obj.spaceOut("hello"));
				System.out.println(obj.spaceOut("technology"));
			}
			
			
		}