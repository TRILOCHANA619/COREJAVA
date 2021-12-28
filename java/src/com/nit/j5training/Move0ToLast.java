package com.nit.j5training;

import java.util.Arrays;
import java.util.Scanner;

public class Move0ToLast {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		System.out.println("Enter the no of value to be stored :: ");
		int length=scn.nextInt();
		int[] numArray=new int[length];
		for (int i = 0; i <length; i++) {
			System.out.println("Enter the  "+i+" element ::");
			numArray[i]=scn.nextInt();
		}
		numArray=move0ToLast(numArray);
		System.out.println(Arrays.toString(numArray));
		scn.close();

	}

	private static int[] move0ToLast(int[] numArray) {
		int a=0;
		int b=numArray.length-1;
		int[] array=new int[numArray.length];
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i]==0) {
				array[b--]=numArray[i];
			} else {
				array[a++]=numArray[i];
			}
		}
		return array;
		
	}

}
