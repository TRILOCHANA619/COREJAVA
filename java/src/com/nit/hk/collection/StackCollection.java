package com.nit.hk.collection;

import java.util.Stack;

public class StackCollection {
public static void main(String[] args) {
	Stack<Object> sc=new Stack<>();
	//System.out.println(sc.capacity());  capacity is not given in the array list
	System.out.println(sc.size());
	System.out.println(sc);
	
	//pushing the element to the Vector collection
	sc.push("a");
	sc.push("b");
	sc.push('c');
	sc.push(5);
	sc.push(true);
	sc.push(5.6);
	sc.push("a");
	sc.push('u');
	sc.push(13);
	sc.push(false);
	
	
	
	System.out.println(sc.size());
	System.out.println(sc);
	
	sc.push("push");
	
	
	System.out.println(sc.size());
	System.out.println(sc);
	
	sc.push(null);
	sc.push(null);
	sc.push(new ex(5,6));
	
	
	System.out.println(sc.size());
	System.out.println(sc);
	
	System.out.println();
	System.out.println(sc.pop());
	System.out.println(sc);
	
	System.out.println();
	System.out.println(sc.pop());
	System.out.println(sc);
	
	System.out.println();
	System.out.println(sc.peek());
	System.out.println(sc);
	
	System.out.println();
	System.out.println(sc.search("b"));
	System.out.println(sc);
}
}
