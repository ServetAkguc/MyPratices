package com.selfpractices5;

public class Highest2DArray {
	 public static void main(String args[]) {
			int[][] arr = {
					{5,2,3,7},
					{1,5,1,1},
					{8,3,1,2}
				};
	 
	        int max =0;
	        for(int i = 0; i < arr.length; i++){
	            for(int j = 0; j < arr[i].length; j++){
	                if(arr[i][j] > max){
	                    max = arr[i][j];
	                }
	            }
	            
	        }
	        System.out.println("Maximum Value : " + max);
	    }
	}