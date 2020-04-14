package com.selfpractices11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		List<Integer>grades = new ArrayList<Integer>();
		grades.add(5);
		grades.add(10);
		grades.add(1,7);
		
		System.out.println(grades.get(1));
		System.out.println(grades.indexOf(7));
		System.out.println(grades.contains(10));
		
		List<Integer>grades1= Arrays.asList(5,2,6,3);
		System.out.println(grades1.size());
		System.out.println(Arrays.toString(grades1.toArray()));
		
		for(int i=0;i<grades1.size();i++) {
			grades1.set(i, grades1.get(i) * 2);
			System.out.println(grades1.get(i));
		}
		
	}
}
