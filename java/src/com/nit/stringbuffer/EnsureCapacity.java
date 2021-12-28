package com.nit.stringbuffer;

public class EnsureCapacity {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(3);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.ensureCapacity(5);
		System.out.println(sb.capacity());

		sb.ensureCapacity(20);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(15);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(0);
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(-5);
		System.out.println(sb.capacity());
		
		sb.append("abcd");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
