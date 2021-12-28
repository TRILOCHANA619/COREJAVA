package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFirstAndFailSafe {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("d");
		al.add("e");
		al.add("f");
		
		Vector<Object> v=new Vector<Object>();
		v.add("a");
		v.add("b");
		v.add("c");
		
		Iterator<Object> itr=al.iterator();
		System.out.println(itr.next());
		al.add("c");
		//System.out.println(itr.next());
		System.out.println();				//Fail-first
		
		Enumeration<Object> en=Collections.enumeration(al);
		System.out.println(en.nextElement());
		al.add("c");
		//System.out.println(en.nextElement());		//Fail-First
		System.out.println();
		
		Enumeration<Object> en1=v.elements();
		System.out.println(en1.nextElement());
		v.add("c");
		System.out.println(en1.nextElement());		//Fail-Safe
		System.out.println();
		
		
		Enumeration<Object> en3=Collections.enumeration(v);
		System.out.println(en3.nextElement());
		v.add("c");
		//System.out.println(en3.nextElement());		//Fail-First
		System.out.println();
		
		//if we want array list as a Fail-Safe the we have to use CopyOnWriteArrayList <T> class
		CopyOnWriteArrayList<Object> cowal=new CopyOnWriteArrayList<Object>();
		cowal.add("g");
		cowal.add("h");
		cowal.add("i");
		
		itr=cowal.iterator();
		System.out.println(itr.next());
		cowal.add("j");
		System.out.println(itr.next());
		System.out.println(itr.next());
		
	}

}
