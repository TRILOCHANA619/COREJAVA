package com.nit.hk.projectcomponent;

public class StudentDetails {
	String name;
	int rollNumber;
	public StudentDetails(String name,int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(name+rollNumber);
	}
}
