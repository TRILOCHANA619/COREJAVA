package com.nit.hk.string.pratic;

public class Test04_CharProblem {
	public static void main(String[] args) {
		char ch[]= {'a','b','c','d'};
		//ch[4]='n';    RE:java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		System.out.println(ch);
		//char.xxx() not available
		
		String s1=new String("hari");
		System.out.println(s1.concat("nareshIt"));
		//s1.xxx() available
		System.out.println(s1.toUpperCase());
		s1=s1.concat("NIT");
		System.out.println(s1.toLowerCase());
	}
}
