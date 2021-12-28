package com.nit.stringbuffer;

public class Set_CharAt_AndReplace {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("abc bbc cbc");
		System.out.println("String Buffer capacity :"+sb1.capacity());
		System.out.println("String Buffer length :"+sb1. length());
		System.out.println("String Buffer :"+sb1);
		System.out.println();
		
		sb1.setCharAt(3, '-');
		System.out.println("String Buffer capacity :"+sb1.capacity());
		System.out.println("String Buffer length :"+sb1. length());
		System.out.println("String Buffer :"+sb1);
		System.out.println();
		
		sb1.setCharAt(7, '-');
		System.out.println("String Buffer capacity :"+sb1.capacity());
		System.out.println("String Buffer length :"+sb1. length());
		System.out.println("String Buffer :"+sb1);
		System.out.println();
		
		sb1.setCharAt(5, 'B');
		System.out.println("String Buffer capacity :"+sb1.capacity());
		System.out.println("String Buffer length :"+sb1. length());
		System.out.println("String Buffer :"+sb1);
		System.out.println();
		
		sb1.setCharAt(sb1.length()-1, 'Y');
		System.out.println("String Buffer capacity :"+sb1.capacity());
		System.out.println("String Buffer length :"+sb1. length());
		System.out.println("String Buffer :"+sb1);
		System.out.println();
		
		//sb1.setCharAt(sb1.length(), 'Y');
		//System.out.println("String Buffer capacity :"+sb1.capacity());
		//System.out.println("String Buffer length :"+sb1. length());
		//System.out.println("String Buffer :"+sb1);
		//System.out.println();
		
		//replace
		
		sb1.replace(2, 5, "XYZ");
		System.out.println("String Buffer capacity :"+sb1.capacity());
		System.out.println("String Buffer length :"+sb1. length());
		System.out.println("String Buffer :"+sb1);
		System.out.println();
		
		sb1.replace(2, 7, "XYZ");
		System.out.println("String Buffer capacity :"+sb1.capacity());
		System.out.println("String Buffer length :"+sb1. length());
		System.out.println("String Buffer :"+sb1);
		System.out.println();
		
		sb1.replace(2, 4, "MNOP");
		System.out.println("String Buffer capacity :"+sb1.capacity());
		System.out.println("String Buffer length :"+sb1. length());
		System.out.println("String Buffer :"+sb1);
		System.out.println();
	}

}
