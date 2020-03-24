package com.selfpractices;

public class LogicalOperations {
	public static void main (String[]args) {
		/*if hour between 1-11==>morning
		 * if hour between 12-15==>afternooon
		 * if hour between 16-20==>evening
		 * if hour between 21-24==>nihgt
		 * 
		 */
		
		
		int hour=12;
		String timeOfDay;
		if (hour>=1 && hour<=11) {
			timeOfDay="morning";
		}else if(hour>11 && hour<=15) {
			timeOfDay="afternoon";
		}else if(hour>15 && hour<=20) {
			timeOfDay="evening";
		}else if(hour>20 && hour<=24) {
			timeOfDay="night";
		}else {
			timeOfDay="unknown";
		}
		//if time of the day is not known==>only then I want to see the message
		if(!timeOfDay.equals("unknown")) {
			System.out.println("Time of the day is "+ timeOfDay);	
		}
		
	}
}
