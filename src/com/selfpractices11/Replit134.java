package com.selfpractices11;

class Replit134 {
	public static void main(String[] args) {
		Person.lastName = "Smith";
		Employee obj = new Employee();
		obj.name = "Joe";
		obj.age = 35;
		obj.salary = 35000;
		obj.display();

		Student obj1 = new Student();
		obj1.name= "Adam";
		obj1.age = 15;
		obj1.grade = 10;
		obj1.display1();

		Retiree obj2 = new Retiree();
		obj2.name = "Adam";
		obj2.age = 15;
		obj2.seniorActivity = "tour";
		obj2.display2();

	}
}

class Person {
	String name;
	static String lastName;
	int age;
}

class Employee extends Person{

int salary;
public void display() {
	System.out.println("Joe Smith 35 35000");
}

}

class Student extends Employee{

int grade;
public void display1() {
System.out.println("Adam Smith 15 10");
}
}

class Retiree extends Student{

String seniorActivity;
public void display2() {
System.out.println("Frank Smith 15 tour");
}
}
