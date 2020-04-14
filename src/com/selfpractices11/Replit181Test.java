package com.selfpractices11;
import java.util.ArrayList;
public class Replit181Test {
	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<>();
		obj.add("hi");
		obj.add("yo");
		obj.add("sup");
		obj.add("yolo");
		obj.add("boop");
		
		obj.remove(0);
		obj.remove(1);
		obj.remove(2);
		
		for(String o:obj) {
			System.out.println(o);
		}
		
		
	}

}
