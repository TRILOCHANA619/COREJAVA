package com.nit.j5training;

// Printing the String like Do upper case in Specific position
// welcome---->WeLcOmE   A=65 a=97
import java.util.Scanner;

public class PrintingSpecicLetterInCapital {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String");
		String input=scn.nextLine();
		System.out.println(SpecificCapitalLetter(input));
		scn.close();

	}

	private static String SpecificCapitalLetter(String input) {
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < input.length(); i++) {
			if (i%2==0) {
				sb=sb.append((char)(input.charAt(i)-32));
			} else {
				sb=sb.append(input.charAt(i));
			}
		}
		return sb.toString();
		
	}

}
