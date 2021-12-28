package com.nit.j5training;


import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class CheckCharacterIsPresentOrNot {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		int  index=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Sentence where to search::");
		String sentence=scn.nextLine().toLowerCase();
		char searcch[]=sentence.toCharArray();
		for (int j = 0; j < searcch.length; j++) {
			int occurance=0;
			for (int i = 0; i < sentence.length(); i++) {
				if (sentence.charAt(i)==searcch[j]) {
					occurance=occurance+1;
				}
			}
			if (occurance>1) {
				list1.add(j);
			} else {
				list2.add(j);
			}
		}
		//System.out.println(list1);
		//System.out.println(list2);
		System.out.println("the first  repeted char is:-  "+searcch[list1.get(0)]);
		System.out.println("the first not repeted char is:-  "+searcch[list2.get(0)]);
	}

}
