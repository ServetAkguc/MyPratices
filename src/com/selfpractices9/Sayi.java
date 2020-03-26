package com.selfpractices9;

class SayiTop {
    static int sumEvenToX=0;
	  int sum(int x){
	
	    for (int i=1;i<=x;i++){
	    	 
	   if(i%2==0){
	    sumEvenToX+=i;
	    }
	} 
		return sumEvenToX;

	  }
	  public static void main(String[]args){
		  SayiTop rakam=new SayiTop();
	    rakam.sum(8);
	    System.out.println(sumEvenToX);
	    
	  }
	  
	}
