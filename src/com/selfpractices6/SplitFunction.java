package com.selfpractices6;

public class SplitFunction {

	public static void main(String[] args) {
		System.out.println("===split() FUNCTION=====");
		
		String today="Today is my favorite Java Class";
		String[]array=today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite Java Class";
		String[]stringArray=today1.split("a");
		//print all elements from array 1 by 1
		//(element type variable name:name of array)
		for(String arr:stringArray) {
			System.out.print(arr+"=");
		}
		System.out.println();
		
		//We want to print String word by word
		String today2="Today is my favorite Java Class";
		String[]words=today2.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
	}
}
