package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Test_Enumeration {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<Object>();
		v.add("a");
		v.add("b");
		v.add("c");
		
		Enumeration<Object> e= v.elements();
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);
		}
		
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("d");
		al.add("e");
		al.add("f");
		
		Enumeration<Object> e1=Collections.enumeration(al);
		while (e1.hasMoreElements()) {
			Object object = (Object) e1.nextElement();
			System.out.println(object);
		}

	}

}
