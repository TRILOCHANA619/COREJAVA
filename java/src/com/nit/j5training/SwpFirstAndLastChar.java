package com.nit.j5training;


//Swap last  and first character
//welcome---> eelcomw
import java.util.Scanner;

public class SwpFirstAndLastChar {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String input=scn.nextLine();
		System.out.println(swapFirstLast(input));
		scn.close();

	}

	private static String swapFirstLast(String input) {
		StringBuffer sb=new StringBuffer();
	for (int i = 0; i < input.length(); i++) {
	if (i==0) {
		sb=sb.append(input.charAt(input.length()-1));	
		} else if(i==input.length()-1) {
			sb=sb.append(input.charAt(0));
		}else {
			sb=sb.append(input.charAt(i));
		}
	}
	return sb.toString();
	}

}
