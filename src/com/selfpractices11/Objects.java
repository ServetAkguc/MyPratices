package com.selfpractices11;

import java.util.List;

public class Objects {

	public static void main(String[] args) {
	
	}	
		public static int sumEven(List<Integer> li) {
		    int sum = 0;
		    for (Integer i : li)
		        if (i.intValue() % 2 == 0)
		            sum += i.intValue();
		        return sum;
		}
}
