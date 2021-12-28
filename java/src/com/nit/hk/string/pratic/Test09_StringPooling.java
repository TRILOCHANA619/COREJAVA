package com.nit.hk.string.pratic;

public class Test09_StringPooling {

	public static void main(String[] args) {
		// case -1 literal
		String s1="hari";
		String s2= "hari";
		System.out.println(s1==s2);
		
		//case -2 new
		String s3=new String("hari");
		String s4=new String("hari");
		System.out.println(s3==s4);

	}

}
