package com.nit.j5training;

import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number to see the respectedmonths: ");
		System.out.println(removeDuplicateChar(scn.next()));
		scn.close();
	
	
	}

	private static String removeDuplicateChar(String s) {
		StringBuffer sb=new StringBuffer(s);
		//String[] ar=s.split("");
		//System.out.println(ar.toString());
	//	String output=null;
		for (int i = 0; i < sb.length()-1; i++) {
			System.out.println("checking "+i);
			for (int j = i+1; j < sb.length()-1; j++) {
				System.out.println("checking  j "+j);
				if (sb.charAt(i)==sb.charAt(j)) {
					System.out.println(sb);
					//System.out.println(s.charAt(j)+""+j);
					//output=s.replace(ar[j],"");
					System.out.println(sb.charAt(j));
					sb.deleteCharAt(j);
					System.out.println(sb);
					System.out.println();
				}
			}
			
		}
		return sb.toString();
	}

}
