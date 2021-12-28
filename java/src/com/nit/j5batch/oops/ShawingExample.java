package com.nit.j5batch.oops;

public class ShawingExample {

	private static String shadowVar="static from class-shadowVaar";
	private  String shadowVar1="non-static from class-shadowVaar1";
	
	
	public static void main(String[] args) {
		String shadowVar="from main-shadowVaar";
		 String shadowVar1="from main-shadowVaar1";	
		 System.out.println(shadowVar);
		 System.out.println(shadowVar1);
		 System.out.println();
		 System.out.println(ShawingExample.shadowVar);
		// System.out.println(ShawingExample.shadowVar1);
		 System.out.println();
		 ShawingExample se=new ShawingExample();
		 System.out.println(se.shadowVar);
		 System.out.println(se.shadowVar1);
		 

	}

}
