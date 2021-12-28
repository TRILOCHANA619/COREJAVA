package com.nit.hk.string.methods;

import java.util.List;

public class Join {

	public static void main(String[] args) {
		String s1=String.join("-", "a","b","c","d");
		String s2=String.join(" ", "a","b","c","d");
		String s3=String.join("-");
		String s4=String.join("-", "a");
		String s5=String.join("-", "a","b");
		String s6=String.join("-", "a",new StringBuffer("b"), new StringBuilder("c"));

		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		System.out.println("s3 :"+s3);
		System.out.println("s5 :"+s4);
		System.out.println("s5 :"+s5);
		System.out.println("s6 :"+s6);

		String s7=String.join(":", new String[] {"1","2","3"});
		System.out.println("s7 :"+s7);
		String s8=String.join(":",new StringBuffer[] {new StringBuffer("m"),new StringBuffer("n"),new StringBuffer("o")});
		System.out.println("s8 :"+s8);
		List<String> al=List.of("p","q","r");
		String s9=String.join("*",al);
		System.out.println("s9 :"+s9);
	}
}
