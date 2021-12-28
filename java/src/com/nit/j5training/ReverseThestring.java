package com.nit.j5training;

//Reverse the String without reverse  method
// like hello--> olleh

import java.util.Scanner;

public class ReverseThestring {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String input=scn.nextLine();
		System.out.println(reverse(input));
		scn.close();

	}

	private static String reverse(String input) {
		StringBuffer reverse=new StringBuffer();
		String splits[]=input.split("");
		for (int i = (splits.length-1); i >=0; i--) {
			reverse=reverse.append(splits[i]);
		}
		return reverse.toString();
	}

}
