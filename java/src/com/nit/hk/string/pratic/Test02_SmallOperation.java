package com.nit.hk.string.pratic;

import java.util.Scanner;

public class Test02_SmallOperation {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the name:-");
		String s1=scn.nextLine();
		if (s1.equals("hari")) {
			System.out.println("hi "+s1.toUpperCase());
		}else {
			System.out.println("Are u "+s1.concat("krihsna")+"?");
		}
		scn.close();

	}

}
