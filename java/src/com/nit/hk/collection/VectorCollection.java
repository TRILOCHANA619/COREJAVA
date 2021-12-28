package com.nit.hk.collection;

import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {
		Vector<Object> cv=new Vector<>();
		System.out.println(cv.capacity());
		System.out.println(cv.size());
		System.out.println(cv);
		
		//adding the element to the Vector collection
		cv.add("a");
		cv.add("b");
		cv.add('c');
		cv.add(5);
		cv.add(true);
		cv.add(5.6);
		cv.add("a");
		cv.add('u');
		cv.add(13);
		cv.add(false);
		
		
		System.out.println(cv.capacity());
		System.out.println(cv.size());
		System.out.println(cv);
		
		cv.add("add");
		
		System.out.println(cv.capacity());
		System.out.println(cv.size());
		System.out.println(cv);
		
		cv.add(null);
		cv.add(null);
		
		System.out.println(cv.capacity());
		System.out.println(cv.size());
		System.out.println(cv);
		
		for (int i = 0; i < cv.size(); i++) {
			System.out.println(cv.get(i));
			System.out.println();
		}
		
		//foreach loop
		for (Object object : cv) {
			System.out.println(object);
		}
		System.out.println();
		//rule to get the data
		//rule-1:: can only give index between 0 to Size()-1
		
		System.out.println(cv.get(3));
		System.out.println(cv.get(cv.size()-1));
		//System.out.println(cv.get(-1));
		//System.out.println(cv.get(14));
		//System.out.println(cv.get(cv.size()));
		
		//rule-2:we create vector with <Object> as generic,
			//get Method return type is Object .
			//Hence we cannot asssign get() method call to the returning object type variable
			//If we want to store in returng type then we want to type cast
		
		//String s1=cv.get(0);
		String s1=(String)cv.get(0);
		System.out.println();
		System.out.println(s1);
		
		//rule-3:: When we assign get() method call to Object type variable(),
			//we canot invoke the member of returned object
			//we must type cast to its own type to call specific method
		Object obj=cv.get(0);
		//System.out.println(obj.toUpperCase());
		
		//rule-4:: we must not type cast the object , we may get CCE
			//wemust type cast under instanceof operator condition
		
		if (obj instanceof String) {
			System.out.println(((String)obj).toUpperCase());
		}
	}
}
