package com.selfpractices9;

public class Replit113RB {
	 public int sumEvenToX(int x)	{
		 
			int sum=0;
			for(int i=1;i<=x;i++) {
				if(i%2==0) {
				sum+=i;
			  }
			}
			return sum ;
		}
		//		test case below (dont change):
				public static void main(String[] args){
					Replit113RB obj=new Replit113RB();
					System.out.println(obj.sumEvenToX(5)); //6
					System.out.println(obj.sumEvenToX(8)); //20
				}
			}