package com.selfpractices4;

public class Replit74 {
	 public static void main(String[]args){
		    int [] years={2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020};
		    //1st way
		    for (int i=0;i<years.length;i++){
		      System.out.println(years[i]);
		    }
		    System.out.println("*********************");
		    //2nd way
		    for(int year:years) {
		    	System.out.println(year);
		    }
		    System.out.println("+++++++++++++++");
		    int[] years1 = new int[11];

			for (int i = 0; i <years1.length; i++) {

				years1[i] = 2010 + i;
			}
			
			
			for (int i = 0; i <years1.length; i++) {

				System.out.println(years1[i]);
			}
			
		  }
		  
		  
		}

