package com.nit.j5training;

import java.util.Scanner;

public class FindTwoNumberAddResultEqualGIvenNo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		System.out.println("Enter the no of value to be stored :: ");
		int length=scn.nextInt();
		int[] numArray=new int[length];
		for (int i = 0; i <length; i++) {
			System.out.println("Enter the  "+i+" element ::");
			numArray[i]=scn.nextInt();
		}
		System.out.println("enter  the addition number :: ");
		int number=scn.nextInt();
		getTwonumber(numArray,number);
		
		scn.close();

	}

	private static void getTwonumber(int[] numArray, int number) {
		//int[] first=new int[numArray.length];
		int count=0;
		//int[] last=new int[numArray.length];
		for (int i = 0; i < numArray.length; i++) {
			for (int j = i+1; j < numArray.length; j++) {
				if (numArray[i]+numArray[j]==number) {
					System.out.println(numArray[i]+"+"+numArray[j]+"="+number);
					count=1;
					break;
					
				}
				
			}
			
		}
		if (count==0) {
			
			System.out.println("No numbers found");
		}
		
	}

}
