package com.nit.hk.collectionproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentMarkDetails {

	
	public static void main(String[] args) {
		List list=new ArrayList();
		//List<Integer> list=new ArrayList<Integer>();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the No of student to display :: ");
		int count=scn.nextInt();
		scn.nextLine();
		for (int i = 1; i <= count; i++) {
			System.out.println("Enter the "+i+" student Details");
			list.add(scn.nextLine());
		}
		
		Collections.sort(list);
		
		for (Object object : list) {
			System.out.println("The Mark of first Students is:: "+object);
		}
		scn.close();

		
	}

}
