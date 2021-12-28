package com.nit.j5batch.inheritanceconcept;

public class SubClass extends SuperClass{

	public SubClass() {
		super("hari","krishna");
	System.out.println("SubClass.SubClass()-0 param cnsructor");
	}
	public SubClass(String firstName) {
		
		this();
		System.out.println("SubClass.SubClass()-1 param constructor");
	}
	public SubClass(String firstName, String lastName) {
		this("hari");
		System.out.println("SubClass.SubClass()-2param constructor");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		new SubClass("java", "faculty");
		System.out.println("main end");
	}
	

}
