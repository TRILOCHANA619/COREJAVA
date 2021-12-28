package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Test_Iterator {
	public static void main(String[] args) {
		Vector<Object> v=new Vector<Object>();
		v.add("a");
		v.add("b");
		v.add("c");
		Iterator<Object> i=v.iterator();
		while (i.hasNext()) {
			Object object =i.next();
			System.out.println(object);
			
		}
		
		
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("d");
		al.add("e");
		al.add("f");
		Iterator<Object> i1=al.iterator();
		while (i1.hasNext()) {
			Object object =  i1.next();
			System.out.println(object);
		}

	}
}
