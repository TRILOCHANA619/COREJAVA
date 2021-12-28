package com.informatry.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(5);
		list.add(9);
		list.add(4);
		Collections.sort(list);
		System.out.println(list);
		
		int secondHighest= getSecondHighestNumber(list);
		System.out.println("The second highest is ::"+ secondHighest);
	}
	
	public static int getSecondHighestNumber(List<Integer> list) {
		int[] num=new int[list.size()];
		System.out.println(num);
		System.out.println(list);
		for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i)<list.get(i+1)) {
				num[i]=list.get(i);
			} else {
				num[i]=list.get(i+1);
			}
		}
		System.out.println(Arrays.toString(num));
		
return num[1];
	}

}
