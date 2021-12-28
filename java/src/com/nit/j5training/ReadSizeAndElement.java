package com.nit.j5training;

import java.util.Scanner;

public class ReadSizeAndElement {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size  of Array :: ");
		int length=scn.nextInt();
		System.out.println();
		int[] numArray=new int[length];
		for (int i = 0; i <length; i++) {
			System.out.println("Enter the "+(i+1)+" element");
			numArray[i]=scn.nextInt();
		}
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		//System.out.println(numArray[6]);
		scn.close();
	}

}
