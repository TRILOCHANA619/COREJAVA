package com.nit.j5training;

import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number to see the respectedmonths: ");
		System.out.println(checkVowls(scn.nextLine()));
		scn.close();

	}

	private static String checkVowls(String s) {
				
					if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")) {
						return "The Statement containt vowels";
					}
				return "The Statement containt no vowels";
	}

}
