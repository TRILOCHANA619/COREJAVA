package com.nt.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		HashSet<String> h1=new HashSet<String>();
		h1.add("Asit");
		h1.add("Lukul");
		h1.add("Trilo");
		h1.add("Trilo");
		System.out.println(h1);
		
		LinkedHashSet<String> h2=new LinkedHashSet<String>();
		h2.add("Asit");
		h2.add("ZAA");
		h2.add("Trilo");
		h2.add("Asit");
		System.out.println("linked hs:::"+h2);
		
		TreeSet<String> h3=new TreeSet<String>();
		h3.add("Trilo");
		h3.add("Tuna");
		h3.add("Rockey");
		h3.add("Asit");
		System.out.println(h3+".......");
		System.out.println(h3.remove("Rockey"));
		System.out.println(h3);
		
		System.out.println("started list");
		ArrayList<String>a=new ArrayList<String>();
		a.add("Asit");
		a.add("Lukul");
		a.add("moc");
		a.add("Asit");
		a.add("Papu");
		System.out.println("ArrayList::"+a);
		
		LinkedList<String> a2=new LinkedList<String>();
		a2.add("Asit");
		a2.add("Don");
		a2.add("Vcky");
		a2.add("Rck");
		a2.add("Duc");
		System.out.println("linkedList::"+a2);
		
		Vector<Integer> a3=new Vector<Integer>();
		a3.add(25);
		a3.add(12);
		a3.add(32);
		a3.add(26);
		a3.add(36);
		System.out.println("vector::"+a3);
		
	}

}
