package com.selfpractices8;

public class LocalVariables {

	void nameInside() {
		String name = "John";// local variable that visible only within method it was declared
	}
	void anotherName() {
		String name="Jane";
	}

	public static void main(String[] args) {
		// System.out.println(name);CE:name wont be visible to another method since its
		// scope only within name inside method
		
		LocalVariables obj=new LocalVariables();
		obj.nameInside();
		

		boolean flag = true;
		if (flag) {
			String answer = "Yes";
		}
		// System.out.println(answer);CE: scope of variable answer is not visible ouside
		// of if block

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

	}

}
