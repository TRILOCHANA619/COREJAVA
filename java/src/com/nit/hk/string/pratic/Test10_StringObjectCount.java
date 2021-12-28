package com.nit.hk.string.pratic;

import java.util.Scanner;

public class Test10_StringObjectCount {

	public static void main(String[] args) {
		String s1="a";
		String s2="a";
		String s3="b";
		System.out.println("s1"+System.identityHashCode(s1));
		System.out.println("s2"+System.identityHashCode(s2));
		System.out.println("s3"+System.identityHashCode(s3));
		
		String s4=new String("a");
		String s5=new String("b");
		String s6=new String("b");
		String s7=new String("s6");
		System.out.println("s4"+System.identityHashCode(s4));
		System.out.println("s5"+System.identityHashCode(s5));
		System.out.println("s6"+System.identityHashCode(s6));
		System.out.println("s7"+System.identityHashCode(s7));
		
		String s8=s1.concat(s2);
		String s9=s1.concat(s2);
		System.out.println("s8"+System.identityHashCode(s8));
		System.out.println("s9"+System.identityHashCode(s9));
		
		String s10=s1+s2;
		String s11= s1+s2;
		System.out.println("s10"+System.identityHashCode(s10));
		System.out.println("s11"+System.identityHashCode(s11));
		
		String s12="b";
		String s13="ab";
		String s14="a"+"b";
		String s15=s1+s12;
		System.out.println("s12"+System.identityHashCode(s12));
		System.out.println("s13"+System.identityHashCode(s13));
		System.out.println("s14"+System.identityHashCode(s14));
		System.out.println("s15"+System.identityHashCode(s15));
		
		Scanner scn=new Scanner(System.in);
		String s16=scn.nextLine();
		String s17=scn.nextLine();
		System.out.println("s16"+System.identityHashCode(s16));
		System.out.println("s17"+System.identityHashCode(s17));
		scn.close();
	}

}
