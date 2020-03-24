package com.selfpractices8;

public class Mall {

	int empId;//features
	double salary;
	String name,lastName,title;
	
	
	void working() {//methods, behavior
		System.out.println(title+" is working");
	}
	void getPaid() {
		System.out.println(name+" is getting paid "+salary);
	}
	void attendingMeetings() {
		System.out.println(name+" attending meetings");
	}
	
	public static void main(String[] args) {
		
		Mall emp1=new Mall();
		
		emp1.empId=1223;
		emp1.name="Servet";
		emp1.lastName="Akguc";
		emp1.title="CEO";
		emp1.salary=222.500;
		
		emp1.working();
		emp1.getPaid();
		emp1.attendingMeetings();
		
		Mall emp2=new Mall();
		
		emp2.empId=345;
		emp2.name="Rana";
		emp2.lastName="Akguc";
		emp2.title="QA Test Engineer";
		emp2.salary=100000;
		
		emp2.attendingMeetings();
		emp2.getPaid();
		emp2.working();
		
	}
}
