package com.nit.stringbuffer;

public class TrimToSize {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println();
		
		sb.append("abcdef  ");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println();
		
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println();
	}

}
