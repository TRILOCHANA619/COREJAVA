package com.nit.j5training;

import java.util.Scanner;

public class ArraysEqualOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		System.out.println("Enter the no of value to be stored :: ");
		int length=scn.nextInt();
		int[] numArray=new int[length];
		int[] numArray1= new int[length];
		for (int i = 0; i <length; i++) {
			System.out.println("enter the 1st array "+i+"elements");
			numArray[i]=scn.nextInt();
		}
		for (int i = 0; i <length; i++) {
			System.out.println("enter the 2nd array "+i+"elements");
			numArray1[i]=scn.nextInt();
		}
		equals(numArray,numArray1);

	}

	private static void equals(int[] numArray, int[] numArray1) {
		int counter=0;
		if (numArray.length==numArray1.length) {
			for (int i = 0; i < numArray1.length; i++) {
				if (numArray[i]!=numArray1[i]) {
				 counter=1;
				}
			}
		}
		if (counter==1) {
			System.out.println("not Equal");
		} else {
			System.out.println("equal");
		}
		
	}

}
