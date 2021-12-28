package com.nit.hk.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeCollection {

	public static void main(String[] args) {
		TreeSet<Object> ts1=new TreeSet<Object>();
		ts1.add("a");
		ts1.add("c");
		ts1.add("b");
		System.out.println(ts1);
		//ts1.add(5);
		//ts1.add(null);
		TreeSet<Integer> ts2=new TreeSet<Integer>();
		ts2.add(6);
		ts2.add(7);
		ts2.add(5);
		System.out.println(ts2);
		
		Set<Example> ts3=new TreeSet<>();
		ts3.add(new Example(5,7));
		ts3.add(new Example(8,3));
		ts3.add(new Example(6,2));
		System.out.println(ts3);
		ts3.add(new Example(6,2));
		System.out.println(ts3);
		
		TreeSet<String> ts4=new TreeSet<>(new StringDescComparator());
		ts4.add("a");
		ts4.add("c");
		ts4.add("b");
		ts4.add("e");
		System.out.println(ts4);
	}

}
