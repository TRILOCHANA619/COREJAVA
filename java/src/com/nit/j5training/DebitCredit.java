package com.nit.j5training;

import java.util.Scanner;

public class DebitCredit {

	public static void main(String[] args) {
		char[] ch= {'a','e','i','o','u','A','E','I','O','U'};
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(s.charAt(i)==ch[j] && s.charAt(i+1)!=ch[j]) {
					count++;
				}
			}
			
		}
		System.out.println(count);
	}

}
