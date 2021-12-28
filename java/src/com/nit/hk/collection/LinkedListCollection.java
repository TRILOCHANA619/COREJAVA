package com.nit.hk.collection;

import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {
		LinkedList<Object> ll=new LinkedList<>();
		//System.out.println(ll.capacity());  capacity is not given in the array list
		System.out.println(ll.size());
		System.out.println(ll);
		
		//adding the element to the Vector collection
		ll.add("a");
		ll.add("b");
		ll.add('c');
		ll.add(5);
		ll.add(true);
		ll.add(5.6);
		ll.add("a");
		ll.add('u');
		ll.add(13);
		ll.add(false);
		
		
		
		System.out.println(ll.size());
		System.out.println(ll);
		
		ll.add("add");
		
		
		System.out.println(ll.size());
		System.out.println(ll);
		
		ll.add(null);
		ll.add(null);
		ll.add(new ex(5,6));
		
		
		System.out.println(ll.size());
		System.out.println(ll);
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
			System.out.println();
		}
		
		//foreach loop
		for (Object object : ll) {
			System.out.println(object);
		}
		System.out.println();
		//rule to get the data
		//rule-1:: can only give index between 0 to Size()-1
		
		System.out.println(ll.get(3));
		System.out.println(ll.get(ll.size()-1));
		//System.out.println(ll.get(-1));
		//System.out.println(ll.get(14));
		//System.out.println(ll.get(ll.size()));
		
		//rule-2:we create vector with <Object> as generic,
			//get Method return type is Object .
			//Hence we cannot asssign get() method clll to the returning object type variable
			//If we want to store in returng type then we want to type cast
		
		//String s1=ll.get(0);
		String s1=(String)ll.get(0);
		System.out.println();
		System.out.println(s1);
		
		//rule-3:: When we assign get() method clll to Object type variable(),
			//we canot invoke the member of returned object
			//we must type cast to its own type to clll specific method
		Object obj=ll.get(0);
		//System.out.println(obj.toUpperCase());
		
		//rule-4:: we must not type cast the object , we may get CCE
			//wemust type cast under instanceof operator condition
		
		if (obj instanceof String) {
			System.out.println(((String)obj).toUpperCase());
		}
		
		//Searching the object
		System.out.println(ll.contains(new ex(5,6)));
		//System.out.println(ll.remove(ll.size()-1));
		System.out.println(ll.remove(new ex(5,6)));
		System.out.println(ll);
		
		

	}

}
