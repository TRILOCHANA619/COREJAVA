package com.nit.hk.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test_IteratorRemove {

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		lhs.add(true);
		lhs.add(null);
		
		System.out.println(lhs);
		
		Iterator<Object> itr = lhs.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			if(obj instanceof String) {
				String s = (String)obj;
				System.out.println(s.toUpperCase());
			}else if(obj instanceof Integer) {
				//System.out.println(obj);
				itr.remove();
			}else {
				System.out.println(obj);
			}
		}	
		System.out.println(lhs);	
		
	}

}
