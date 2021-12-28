package com.nit.j5training;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the no of value to be stored :: ");
		int length=scn.nextInt();
		int[] numArray=new int[length];
		for (int i = 0; i <length; i++) {
			numArray[i]=scn.nextInt();
		}
//		for (int i = 0; i < numArray.length; i++) {
//			System.out.println(numArray[i]);
//		}
		System.out.println("The second Heighest element is :: "+secondHighest(numArray));
		scn.close();
	}

	private static int secondHighest(int[] numArray) {
		int temp=0;
		for (int i = 0; i < numArray.length; i++) {
			for (int j = i+1; j <numArray.length; j++) {
				
				if (numArray[i] < numArray[j]) {
					//System.out.println(numArray[i]);
					//System.out.println(numArray[j]);
					//System.out.println();
					temp=numArray[j];
					numArray[j]=numArray[i];
					numArray[i]=temp;
				}
//				for (int k : numArray) {
//					System.out.println(k);
//				}
				//System.out.println();
			}
		}
//		for (int i : numArray) {
//			System.out.println(i);
//		}
		return numArray[1];
	}

}
