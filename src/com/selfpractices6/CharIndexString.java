package com.selfpractices6;

public class CharIndexString {

	public static void main(String[] args) {
		
	    System.out.println("===== charAt() FUNCTION -----");
		String str="Good Morning Students!";
		char letter1=str.charAt(0);
		System.out.println(letter1);
		char letter5=str.charAt(4);
		System.out.println("Letter is index 4 is "+letter5+".");
		
		//get all characters one by one from String?
		char letter;
		for(int i=0;i<str.length();i++) {
			letter=str.charAt(i);
			System.out.print(letter+"-");
		}
		System.out.println();
		
	    System.out.println("====== indexOf() FUNCTION -----");
	    
	    
	    String name="Syntax Technologies";
	    int index=name.indexOf("y");
	    System.out.println(index);
	    
	    index=name.indexOf(" ");
	    System.out.println(index);
	    
	    index=name.indexOf("s");
	    System.out.println(index);
	    
	    index=name.indexOf("Syntax");
	    System.out.println(index);
	    
	    index=name.indexOf("Technologies");
	    System.out.println("Index of substring Technologies="+index);//first index number of the word
	    
	    index=name.indexOf("!");
	    System.out.println("Index of not existing character is "+index);
	
	    index=name.lastIndexOf("s");
	    System.out.println(index);
	    
	}
}
