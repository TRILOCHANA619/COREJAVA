package com.nit.hk.string.pratic;

public class Test13_StringrefVarImmutable {

	public static void main(String[] args) {
		String s1="a";
		System.out.println(s1);
		s1="b";
		System.out.println(s1);
		
		final String s2="b";
		//s2="a";

	}

}
