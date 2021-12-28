package com.nit.hk.string.methods;

import java.util.Arrays;
import java.util.StringTokenizer;

public class String_Operation {

	public static void main(String[] args) {
		String s1="";
		String s2=" ";
		String s3="hari";
		String s4=new String();
		String s5=new String("");
		String s6=new String(" ");
		String s7=new String("Hari");
		String[] s8= {"hari","i","am"};
		String s9=new String("hari");
		String s10=new String("hari");
		String s11="hari";
		String s12="Java is a programming language";
		String s13="abc bbc cbc";
		StringBuffer sb1=new StringBuffer("hari");
		StringBuilder sb2=new StringBuilder("hari");
		StringBuffer sb3=new StringBuffer("hari");
		Example ex=new Example(5);
		
		//1-finding String is empty or not
		//isEmpty()
		/*System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		System.out.println(s4.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println(s6.isEmpty());
		System.out.println(s7.isEmpty());
		//for check string is empty or not 
		System.out.println(s2.trim().isEmpty());
		System.out.println();
		//2-for empty string->isBlank()----> java 11 onwards
		System.out.println(s1.isBlank());
		System.out.println(s2.isBlank());
		System.out.println(s3.isBlank());
		System.out.println(s4.isBlank());
		System.out.println(s5.isBlank());
		System.out.println(s6.isBlank());
		System.out.println(s7.isBlank());
		System.out.println();
		
		//3-for length- length();
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		System.out.println(s5.length());
		System.out.println(s6.length());
		System.out.println(s7.length());
		System.out.println();
		//for array only  length
		//System.out.println(s8.length());
		System.out.println(s8.length);
		System.out.println();
		
		//for object
		//4-printing string character toString()
		System.out.println(s3);
		System.out.println(ex);//in Example class toString() override
		System.out.println();
		
		//5-for comparing the string with case- equals();
		System.out.println(s3=="hari");
		System.out.println(s3.equals("hari"));
		
		System.out.println(s9=="hari");			// deals with reference
		System.out.println(s9.equals("hari"));  // deals with object in reference variable
		//6-compare withoot case- equalsIgnourCase()
		System.out.println(s9.equalsIgnoreCase("HARI"));
		
		System.out.println(s9==s10);			// deals with reference
		System.out.println(s9.equals(s10));  // deals with object in reference variable
		System.out.println(s9.equalsIgnoreCase(s10));
		
		System.out.println("S3==s11"+s3==s11);
		System.out.println("s3==s11"+(s3==s11));
		System.out.println();
		
		//7-Comparing string with StringBuffer and StringBuilder
		//System.out.println(s11==sb1);			
		System.out.println(s11.equals(sb1));  
		//System.out.println(s11.equalsIgnoreCase(sb1));
		
		System.out.println(s11.equals(sb2));
		
		//before java 1.5 onwords
		System.out.println(s11.equals(sb1.toString()));
		System.out.println(s11.equals(sb2.toString()));
		
		// java 1.5 onwards
		System.out.println(s11.contentEquals(sb1));
		System.out.println(s11.contentEquals(sb2));
		
		System.out.println(sb1==sb3);
		System.out.println(sb1.equals(sb3));// equals method not overriddenin string class soit execute from Object class which compare the refernce
		//System.out.println(sb1.contentEquals(sb3));
		*/
		//8-compare the string Lexigraphically-->compareTo();
		System.out.println(s1.compareTo(s11));
		System.out.println(s3.compareTo(s11));
		System.out.println(s3.compareTo("HARI"));
		System.out.println(s3.compareToIgnoreCase("HARI"));
		System.out.println();
		/*
		//9-search the Char/Substring----->contains()
		System.out.println(s12.contains("program"));
		System.out.println(s12.contentEquals("program"));
		//System.out.println(s12.contains('j'));
		
		//10-if we want to know where the string  is present--> indexOf(String s,Int FromIndex) and lastIndexOf()
		System.out.println(s12.indexOf("program"));
		System.out.println(s12.indexOf('a'));
		System.out.println(s12.lastIndexOf('a'));
		System.out.println(s12.indexOf('a',9));
		System.out.println(s12.lastIndexOf('a',9));
		System.out.println(s12.lastIndexOf('A'));//if character is not present then it will return -1
		System.out.println(s12.indexOf('a',-5));//if given index<0 it will starts from initial index. formula (index + 1)
 		System.out.println(s12.lastIndexOf('a',-5));//if given lastindex<0 it will return -1. formula (index - 1)
 		System.out.println(s12.indexOf('a',30));//if given index>length it will return-1 because it can't find the character. formula (index + 1)
 		System.out.println(s12.lastIndexOf('a',90));//if given index>lenngth it will starts from last index. formula (index + 1)
 		System.out.println(s12.indexOf('a',1));
 		System.out.println(s12.lastIndexOf('a',1));
 		System.out.println(s12.indexOf("program"));
 		System.out.println(s12.lastIndexOf("program"));
 		System.out.println(s12.indexOf("PROGRAM"));
 		System.out.println(s12.toUpperCase().indexOf("PROGRAM"));
 		System.out.println();
 		
 		//if we want to search the string i present in particular  position or not
 		if (s12.indexOf("program")!=-1) {
			System.out.println("Available");
		} else {
			System.out.println("not available");
		}
 		//if we want to search i.e present or not
 		if (s12.contains("program")) {
			System.out.println("Available");
		} else {
			System.out.println("not available");
		}
 		
 		//11-find string start with and end with ----> startsWith(String s) and endswith()
 		System.out.println(s13=="abc");
 		System.out.println(s13.equals("abc"));
 		System.out.println(s13.compareTo("abc"));
 		System.out.println(s13.contains("abc"));
 		System.out.println();
 		
 		System.out.println(s13.startsWith("abc"));
 		System.out.println(s13.startsWith("bbc"));
 		System.out.println(s13.endsWith("abc"));
 		System.out.println(s13.endsWith("cbc"));
 		
 		//12-splitting the string with split();
 		String s14="java is a programming language";
 		
 		String[] s=s14.split(" ");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("a");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("A");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("java is a programming language");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("j");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("e");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s14="abc abc abc";
 		s=s14.split("a");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("c");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("abc");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split(" abc");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s14="aaaaaaa";
 		s=s14.split("a");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s14="aaaaaab";
 		s=s14.split("a");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s14="abc.txt";
 		s=s14.split(".");   // here. is re "regrx"-regular expression. .means whole string so split(".") means split("abc.txxt")
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("\\.");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s14="a1b2c3";
 		s=s14.split("[abc]");// for taking 2 delimeter we have to put in [] i.e regex rule
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("[123]");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("[a-z]");// only alphabet as a delimeter
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("[0-9]");// only number as delimeter
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();
 		
 		s=s14.split("");
 		System.out.println(s.length);
 		System.out.println(Arrays.toString(s));
 		System.out.println();*/
 		
 		//String tokenzer
 		String s15="Java Hari Krisna NIT Amrepeet";
 		StringTokenizer sz=new StringTokenizer(s15);
 		StringTokenizer sz1=new StringTokenizer(s15,"r");
 		StringTokenizer sz2=new StringTokenizer(s15,"r",true);
 		System.out.println(sz.countTokens());
 		//int a=sz.countTokens();           not suitable for this
 		/*for (int i = 0; i <=a-; i++) {
			String t=sz.nextToken();
			System.out.println(t);
		}*/
 		
 		while (sz.hasMoreElements()) {
			String token=sz.nextToken();
			System.out.println(token);
		}
 		while (sz1.hasMoreElements()) {
			String token1=sz1.nextToken();
			System.out.println(token1);
		}
 		while (sz2.hasMoreElements()) {
			String token2=sz2.nextToken();
			System.out.println(token2);
		}
 		
 		//13-Conversion  toCharArray() and toByte()
 		
 		String s16="abc";
 		char[] ch=s16.toCharArray();
 		byte[] b=s16.getBytes();
 		System.out.println(Arrays.toString(ch));
 		System.out.println(Arrays.toString(b));
 		
 		
	}
}
