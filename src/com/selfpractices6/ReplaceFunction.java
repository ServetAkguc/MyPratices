package com.selfpractices6;

public class ReplaceFunction {
	public static void main(String[] args) {

		String me="I am a good tester";
		System.out.println("===replace() FUNCTION====");
		
		//if it finds matching char sequence ==>then replace
		System.out.println(me.replace("a", "c"));
		
		me=me.replace("good", "great");
		System.out.println(me);
		//if it is not finding matching sequence ==>not replace
		
		String car="I have a Toyota";
		car=car.replace("Toyota","Mercedes");
		System.out.println(car);
		
		System.out.println("===replaceAll() FUNCTION====");

		String str="Phone number is 520 999 5455";
		str= str.replaceAll("[A-Za-z]","" );
		System.out.println(str);
		
		String str1="Hello12354*&()$%     !@#";
		str1=str1.replaceAll("[0-9]", "=");
		System.out.println(str1);
		str1=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1);
		
		String str2="Hello1234^^^&&**##";
		str2=str2.replaceAll("[^A-Za-z0-9]","");
		System.out.println(str2);
		
		
		String str3="Hello all students";
		str3=str3.replaceAll(" ","");
		System.out.println(str3);
		
		
	}
}
