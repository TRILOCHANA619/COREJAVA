package com.nit.j5training;

import java.util.Scanner;

public class Factorrial {

	public static void main(String[] args) {
		int fact=1;
		Scanner scn=new Scanner(System.in);
		int  num=scn.nextInt();
		for (int i = 1; i <=num; i++) {
			fact=fact*i;

		}
		System.out.println(fact);
		scn.close();
	}
}
