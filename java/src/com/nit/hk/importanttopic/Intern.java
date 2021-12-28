package com.nit.hk.importanttopic;

import java.util.Scanner;

public class Intern {

	public static void main(String[] args) {
		String s1="H";
		String s2=s1.intern();
		System.out.println(s1==s2);
		System.out.println();
		
		String s3=new String("NIT");
		String s4=s3.intern();
		String s5="NIT";
		String s6=new String("NIT");
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println(s5==s4);
		System.out.println(s5==s6);
		System.out.println();
		
		String s7=s1.concat("k");
		String s8=s1.concat("k");
		String s9=s1.concat("k").intern();
		String s10=s1.concat("k").intern();
		System.out.println(System.identityHashCode(s10));
		System.out.println(System.identityHashCode(s9));
		System.out.println(s7==s8);
		System.out.println(s7==s9);
		System.out.println(s9==s10);
		System.out.println();
		
		String s11="HK";
		System.out.println(s10==s11);
		System.out.println(System.identityHashCode(s11));
		System.out.println();
		
		String s12=s1.concat("NIT").intern();
		String s13=s1.concat("NIT").intern();
		System.out.println(s13==s12);
		System.out.println();
		
		String s14=s1.concat("NIT");
		System.out.println(s12==s14);
		System.out.println();
		
		String s15=(s1+"Amreepet").intern();
		String s16=(s1+"Amreepet").intern();
		System.out.println(s15==s16);
		System.out.println();
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two Strings:-");
		String s17=scn.nextLine();
		String s18=scn.nextLine();
		System.out.println(s17==s18);
		System.out.println();
		
		System.out.println("Enter two Strings:-");
		s17=scn.nextLine().intern();
		s18=scn.nextLine().intern();
		System.out.println(s17==s18);
		System.out.println();
		scn.close();
		
	}

}
