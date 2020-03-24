package com.selfpractices4;

import java.util.Arrays;

public class ParallelSortArray {
	public static void main(String[] args) {

		int[]grades= {1,2,3,72,5};
		//Arrays.sort(grades);
		Arrays.parallelSort(grades);
		System.out.println(Arrays.toString(grades));
	}
}
