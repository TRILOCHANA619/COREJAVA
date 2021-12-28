package com.nit.j5batch.inheritanceconcept;

public class SuperClass {

	
	public SuperClass() {
	System.out.println("SuperClass.SuperClass()-0 param cnsructor");
	}
	public SuperClass(String firstName) {
		
		this();
		System.out.println("SuperClass.SuperClass()-1 param constructor");
	}
	public SuperClass(String firstName, String lastName) {
		this("hari");
		System.out.println("SuperClass.SuperClass()-2param constructor");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		new SuperClass("hari", "krishna");
		System.out.println("main end");
	}
	

}
