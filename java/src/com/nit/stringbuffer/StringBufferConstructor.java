package com.nit.stringbuffer;

public class StringBufferConstructor {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println("String Buffer capacity :"+sb1.capacity());
		System.out.println("String Buffer length :"+sb1. length());
		System.out.println("String Buffer :"+sb1);
		System.out.println();
		
		StringBuffer sb2=new StringBuffer(5);
		System.out.println("String Buffer capacity :"+sb2.capacity());
		System.out.println("String Buffer length :"+sb2. length());
		System.out.println("String Buffer :"+sb2);
		System.out.println();
		
		StringBuffer sb3=new StringBuffer("abc");
		System.out.println("String Buffer capacity :"+sb3.capacity());
		System.out.println("String Buffer length :"+sb3. length());
		System.out.println("String Buffer :"+sb3);
		System.out.println();
		
		sb1.append("d");
		System.out.println("String Buffer capacity :"+sb1.capacity());
		System.out.println("String Buffer length :"+sb1. length());
		System.out.println("String Buffer :"+sb1);
		System.out.println();
		
		StringBuffer sb4=new StringBuffer(sb3);
		System.out.println("String Buffer capacity :"+sb4.capacity());
		System.out.println("String Buffer length :"+sb4.length());
		System.out.println("String Buffer :"+sb4);
		System.out.println();
		
		//StringBuffer sb5=new StringBuffer(-5);
		//StringBuffer sb6=new StringBuffer(null);
		//String s1=new String(null);
		//String s1=new String((String)null);
		StringBuffer sb7=new StringBuffer("null");
		
		StringBuffer sb8=null;
		System.out.println("sb8"+sb8);
		System.out.println();
		
		StringBuffer sb10=new StringBuffer("null");
		System.out.println("s10 capacity : "+sb10.capacity());
		System.out.println("s10 length : "+sb10.length());
		System.out.println("s10  : "+sb10.capacity());
		System.out.println();
	}

}
