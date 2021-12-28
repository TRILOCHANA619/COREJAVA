package com.nit.j5batch.oopsstudent;

public class Student {
	private int rollNo;
	private String name;
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public void display() {
		System.out.println("Student name:- "+name);
		System.out.println("Student RollNumber:- "+rollNo);
	}
	
	

}
