package com.nit.hk.string.pratic;

import java.util.Comparator;
import java.util.TreeSet;

class A{
	static  int m1(StringBuilder sb1,StringBuilder sb2) {
		return sb1.toString().compareTo(sb2.toString());
	}
}

class SBComparator implements Comparator<StringBuilder>{
	public int compare(StringBuilder sb1,StringBuilder sb2) {
		String s1=sb1.toString();
		String s2=sb2.toString();
		return s1.compareTo(s2);
	}
}

public class Test07_StringBuilderRelation_java11 {

	public static void main(String[] args) {
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("a");
		ts1.add("c");
		ts1.add("b");
		System.out.println(ts1);
		System.out.println();

		TreeSet<String> ts2=new TreeSet<String>();
		ts2.add(new StringBuilder("a").toString());
		ts2.add(new StringBuilder("c").toString());
		ts2.add(new StringBuilder("b").toString());
		System.out.println(ts2);

		System.out.println();

		//JAVA 1.0 Explicit subclass
		TreeSet<StringBuilder> ts3=new TreeSet<>(new SBComparator());
		ts3.add(new StringBuilder("a"));
		ts3.add(new StringBuilder("c"));
		ts3.add(new StringBuilder("b"));
		System.out.println(ts3);

		System.out.println();

		//JAVA 1.1 AIC 
		TreeSet<StringBuilder> ts4=new TreeSet<>(new Comparator<StringBuilder>() {
			@Override
			public int compare(StringBuilder sb1,StringBuilder sb2) {
				return sb1.toString().compareTo(sb2.toString());
			}});
		ts4.add(new StringBuilder("a"));
		ts4.add(new StringBuilder("c"));
		ts4.add(new StringBuilder("b"));
		System.out.println(ts3);
		
		System.out.println();
		
		//JAVA 8 LE
		TreeSet<StringBuilder> ts5=new TreeSet<>(
			(StringBuilder sb1,StringBuilder sb2)-> sb1.toString().compareTo(sb2.toString()));
		ts5.add(new StringBuilder("a"));
		ts5.add(new StringBuilder("c"));
		ts5.add(new StringBuilder("b"));
		System.out.println(ts5);
		
		System.out.println();
		
		//Method Reference
		
		TreeSet<StringBuilder> ts6=new TreeSet<>(
				A::m1);
			ts6.add(new StringBuilder("a"));
			ts6.add(new StringBuilder("c"));
			ts6.add(new StringBuilder("b"));
			System.out.println(ts6);
			
			System.out.println();
			
			//From JAVA 11 onwards StringBuilder and StringBuffer is subclass of Comparator class
			
			TreeSet<StringBuilder> ts7=new TreeSet<>();
				ts7.add(new StringBuilder("a"));
				ts7.add(new StringBuilder("c"));
				ts7.add(new StringBuilder("b"));
				System.out.println(ts7);
				
				System.out.println();

	}

}
