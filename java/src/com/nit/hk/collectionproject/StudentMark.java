package com.nit.hk.collectionproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMark {

	public static void main(String[] args) {
//		byte b1=40;
//		byte b2= 128;
//		Byte b3=128;
//		Byte b4=40;
//		Integer i='a';
//		int a='a';
//		long l=50;
//		Long l1=50;
		List<Integer> mark=new ArrayList<Integer>();
		mark.add(70);
		mark.add(40);
		mark.add(50);
		mark.add(48);
		mark.add(98);
		mark.add(56);
		
		Collections.sort(mark);
		int minimum=Collections.min(mark);
		System.out.println(minimum);
		
		int maximum=Collections.max(mark);
		System.out.println(maximum);
		
		int start=mark.indexOf(40);
		int size=mark.size();
		System.out.println(size);
		System.out.println(mark.subList(start, size));
	}

}
