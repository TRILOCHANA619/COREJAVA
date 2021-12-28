package com.nit.hk.string.methods;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		String output=s.replace(" ", "");
		System.out.println(output);
				//		
//		String s1="Hari Krishna Hari NIT hari Amreepet hARi Hydrabad";
//		System.out.println(s1);
//		System.out.println(s1.replace('a', 'A'));
//		System.out.println(s1.replace("hari", "HK"));
//		System.out.println(s1.replaceAll(".", "^"));
//		System.out.println();
//		
//		System.out.println(s1.replaceAll("[Hari]","^"));
//		System.out.println(s1.replaceFirst("Hari","^"));
//		System.out.println(s1.replaceFirst("[Hari]","^"));
//		System.out.println(s1.replaceFirst("a","^"));
//		
//		s1="abc abc abc";
//		System.out.println(s1);
//		s1.replace('a', 'b');
//		System.out.println(s1);
//		System.out.println();
//		
//		String s2=s1.replace('a', 'b');
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println();
//		
//		String s3=s1.replaceFirst("a", "b");
//		System.out.println(s1);
//		System.out.println(s3);
//		System.out.println();
//		
//		s1=s1.replace('a', 'd');
//		System.out.println(s1);
//		System.out.println();
//		
//		String s4=s1.replace('a', 'e');
//		System.out.println(s1);
//		System.out.println(s4);
//		System.out.println(s1==s4);
//		System.out.println();
//		
//		String s5=s1.replace('D', 'e');
//		System.out.println(s1);
//		System.out.println(s5);
//		System.out.println(s1==s5);
//		System.out.println();
//		
//		String s6="abc.txt.doc";
//		String s7=s6.replace(".", "#");
//		System.out.println(s6);
//		System.out.println(s7);
//		System.out.println();
//		
//		String s8=s6.replaceAll(".", "#");
//		System.out.println(s6);
//		System.out.println(s8);
//		System.out.println();
//		
//		String s9=s6.replaceFirst(".", "#");
//		System.out.println(s6);
//		System.out.println(s9);
//		System.out.println();
//		
//		String s10=s6.replaceAll("\\.", "#");
//		System.out.println(s6);
//		System.out.println(s10);
//		System.out.println();
//		
//		String s11=s6.replaceFirst("\\.", "#");
//		System.out.println(s6);
//		System.out.println(s11);
//		System.out.println();
//		
//		String s12="abc$bbc?cbc";
//		
//		String s13=s12.replaceAll("$","-");
//		System.out.println(s13);
//		
//		
//		String s14=s12.replaceAll("\\?","-");
//		System.out.println(s14);
//		
//		
//		String s15=s12.replaceAll("\\$","-");
//		System.out.println(s15);
//		
//		
//		String s16=s12.replaceAll("\\?","@");
//		System.out.println(s16);
//		
//		String s17="abc";
//		String s18=s17.replace('a', 'b');
//		String s19=s17.replace('a', 'b');
//		String s20=s19.replace('a', 'b');
//		System.out.println(s18==s19);
//		System.out.println(s20==s19);
//		System.out.println(s16.equals(s17));
				}

}
