package com.nit.j5training;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class NoOfOccurances {

	public static LinkedHashSet<String> checkOccurance(String s){
		LinkedHashSet<String> list =new LinkedHashSet<String>();
		
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			list.add(s.charAt(i)+"="+count);
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String to see no of occurance: ");
		System.out.println(checkOccurance(scn.nextLine()));
	}

}
