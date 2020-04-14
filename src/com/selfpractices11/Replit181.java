package com.selfpractices11;

import java.util.ArrayList;

public class Replit181 {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("yolo");
		arraylist.add("boop");
		arraylist.add("yo");
		arraylist.add("sup");
		arraylist.add("hi");
	
		arraylist.remove(0);
		arraylist.remove(1);
		arraylist.remove(2);

		for (String object : arraylist) {
			System.out.print(object + " ");
		}

	}
}
