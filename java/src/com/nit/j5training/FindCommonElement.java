package com.nit.j5training;

import java.util.Arrays;
import java.util.Scanner;

public class FindCommonElement {

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

		findCommon(numArray,numArray1);

		scn.close();

	}

	private static void findCommon(int[] numArray, int[] numArray1) {
		int[] output=new int[numArray.length];
		int a=0;
		System.out.println("The first array is :: "+Arrays.toString(numArray));
		System.out.println("The first array is :: "+Arrays.toString(numArray1));
		//int[] count=new int[numArray.length];
		for (int i = 0; i < numArray.length; i++) {
			int counter=0;
			for (int j = 0; j < numArray1.length; j++) {
				if (numArray[i]==numArray1[j]) {
					counter+=1;
				}
			}
			if (counter>0) {
				output[a++]=numArray[i];
			}
		}
		System.out.println(Arrays.toString(output));

	}

}
