package com.selfpractices;

public class NestedIf {

	public static void main(String[] args) {

	boolean quizCompleted =true;
	int score=86;
	
	if (quizCompleted) {
		System.out.println("Let's check your score");
		if (score >=90) {
			System.out.println("great Job");	
		}else if (score >=80) {
			System.out.println("well done");	
		}else if (score>=70) {
			System.out.println("You could have done better");
		}else {
			System.out.println("You failed");
		}
	
	}else {
		System.out.println("Please do your HW");
	}
	
	
	}

}
