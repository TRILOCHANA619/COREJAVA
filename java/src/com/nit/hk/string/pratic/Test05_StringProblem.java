package com.nit.hk.string.pratic;

public class Test05_StringProblem {

	public static void main(String[] args) {
		String s1="hari";
		System.out.println("Before concat "+s1);
		s1.concat("NIT");
		System.out.println("After concat "+s1);
		// if we modify the object  then new String object created
		//performance issue
		
		System.out.println("Before concat "+s1);
		String s2=s1.concat("NIT");
		System.out.println("After concat "+s2);
		
		//if  we mofdifythe object 
		s1=s1.concat("NIT");
		System.out.println("After concat "+s1);
		
		//solution String buffer
		StringBuffer sb1=new StringBuffer("hari");
		System.out.println("sb1: "+sb1);
		sb1.append(" Krishna");
		System.out.println("sb1: "+sb1);
	}

}
