package com.selfpractices9;

class Sayi {
    static int sumEvenToX=0;
	  int sum(int x){
	
	    for (int i=1;i<=x;i++){
	   if(x%2==0){
	     sumEvenToX+=x;
	    } 
	} return sumEvenToX;
	  }
	  public static void main(String[]args){
	    Sayi rakam=new Sayi();
	    rakam.sum(5);
	    System.out.println(sumEvenToX);
	    
	  }
	  
	}
