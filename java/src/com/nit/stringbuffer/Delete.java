package com.nit.stringbuffer;

public class Delete {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("HAri Amreepet Krishna");
		System.out.println("String Buffer :"+sb);
		System.out.println();
		
		sb.delete(5, 13);
		System.out.println("String Buffer :"+sb);
		System.out.println();
		
		sb.deleteCharAt(4);
		System.out.println("String Buffer :"+sb);
		System.out.println();
		
		StringBuffer sb1=new StringBuffer("abcdef");
		System.out.println("String Buffer :"+sb1);
		sb1.deleteCharAt(1);
		sb1.deleteCharAt(2);
		System.out.println("String Buffer :"+sb1);
	}

}
