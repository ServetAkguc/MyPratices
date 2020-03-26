package com.selfpractices9;

public class Replit115 {
	 String censorLetter(String str, char c) {
			
			str=str.replace(c, '*');
			return str;
		}

		public static void main(String[] args){
			
			Replit115 obj=new Replit115();
			System.out.println(obj.censorLetter("computer science",'e')); //"comput*r sci*nc*"
			System.out.println(obj.censorLetter("trick or treat",'t')); //"*rick or *rea*"
		}
}