package com.nit.j5training;

import java.util.Scanner;

public class PrintMonth {

	public static String months(int num) {
		String output=null;
		String months[]= {"january","frebrury","march","april","may","june","july","august","september","october","november","december"};
		try {
			output=months[num-1];
		}catch (Exception e) {
			output="month is not available";
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number to see the respectedmonths: ");
		System.out.println(months(scn.nextInt()));
		scn.close();
		
	}

}
