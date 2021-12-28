package com.nit.hk.collection;

import java.util.ArrayList;


public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		//System.out.println(al.capacity());  capacity is not given in the array list
		System.out.println(al.size());
		System.out.println(al);
		
		//adding the element to the Vector collection
		al.add("a");
		al.add("b");
		al.add('c');
		al.add(5);
		al.add(true);
		al.add(5.6);
		al.add("a");
		al.add('u');
		al.add(13);
		al.add(false);
		
		
		
		System.out.println(al.size());
		System.out.println(al);
		
		al.add("add");
		
		
		System.out.println(al.size());
		System.out.println(al);
		
		al.add(null);
		al.add(null);
		al.add(new ex(5,6));
		
		
		System.out.println(al.size());
		System.out.println(al);
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			System.out.println();
		}
		
		
		//foreach loop
		for (Object object : al) {
			System.out.println(object);
		}
		System.out.println();
		//rule to get the data
		//rule-1:: can only give index between 0 to Size()-1
		
		System.out.println(al.get(3));
		System.out.println(al.get(al.size()-1));
		//System.out.println(al.get(-1));
		//System.out.println(al.get(14));
		//System.out.println(al.get(al.size()));
		
		//rule-2:we create vector with <Object> as generic,
			//get Method return type is Object .
			//Hence we cannot asssign get() method call to the returning object type variable
			//If we want to store in returng type then we want to type cast
		
		//String s1=al.get(0);
		String s1=(String)al.get(0);
		System.out.println();
		System.out.println(s1);
		
		//rule-3:: When we assign get() method call to Object type variable(),
			//we canot invoke the member of returned object
			//we must type cast to its own type to call specific method
		Object obj=al.get(0);
		//System.out.println(obj.toUpperCase());
		
		//rule-4:: we must not type cast the object , we may get CCE
			//wemust type cast under instanceof operator condition
		
		if (obj instanceof String) {
			System.out.println(((String)obj).toUpperCase());
		}
		
		//Searching the object
		System.out.println(al.contains(new ex(5,6)));
		//System.out.println(al.remove(al.size()-1));
		System.out.println(al.remove(new ex(5,6)));
		System.out.println(al);

	}

}
