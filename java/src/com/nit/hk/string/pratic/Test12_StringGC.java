package com.nit.hk.string.pratic;

public class Test12_StringGC {

	public static void main(String[] args) throws InterruptedException {
		String s1="a";
		System.out.println(System.identityHashCode(s1));
		
		s1=null;
		Thread.sleep(5000);
		System.gc();
		
		String s2="a";
		System.out.println(System.identityHashCode(s2));
		

	}

}
