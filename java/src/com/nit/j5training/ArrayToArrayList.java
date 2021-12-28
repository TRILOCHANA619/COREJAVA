package com.nit.j5training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayToArrayList {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		System.out.println("Enter the no of value to be stored :: ");
		int length=scn.nextInt();
		int[] numArray=new int[length];
		for (int i = 0; i <length; i++) {
			System.out.println("Enter the  "+i+" element ::");
			numArray[i]=scn.nextInt();
		}
		ArrayList<Integer> al= convertToArrayList(numArray);
		System.out.println("The arrayList is");

		for (Integer integer : al) {
			System.out.println(integer);
		}
		scn.close();
	}

	private static ArrayList<Integer> convertToArrayList(int[] numArray) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i = 0; i < numArray.length; i++) {
			al.add(numArray[i]);
		}
		return al;
	}

}
