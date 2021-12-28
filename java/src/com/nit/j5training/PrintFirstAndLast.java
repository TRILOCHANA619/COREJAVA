package com.nit.j5training;

import java.util.Scanner;

public class PrintFirstAndLast {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the no of value to be stored :: ");
		int length=scn.nextInt();
		int[] numArray=new int[length];
		for (int i = 0; i <length; i++) {
			System.out.println("Enter the "+(i+1)+" element");
			numArray[i]=scn.nextInt();
		}
		int[] modArray=modifyarray(numArray);
		DisplayModifiedArray(modArray);
		scn.close();
	}

	private static void DisplayModifiedArray(int[] modArray) {
		System.out.print("{");
		for (int i : modArray) {
			System.out.print(i+",");
		}
		System.out.println("}");
		
	}

	private static int[] modifyarray(int[] numArray) {
		int a=(numArray.length)- 1;   //1 2 3 4 5 6
		int b=0;
		int newArray[]=new int[numArray.length];
		
		//int length= Math.round(((float)newArray.length)/2);
		//System.out.println(length);
		for (int i = 0; i < (newArray.length)/2; i++) {
			newArray[b++]=numArray[i];
			//System.out.println(numArray[i]);
			newArray[b++]=numArray[i+a];
			//System.out.println(a);
			//System.out.println(numArray[i+a]);
			a-=2;
		}
		return newArray;
	}

}
