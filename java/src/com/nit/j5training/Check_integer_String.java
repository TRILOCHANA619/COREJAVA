package com.nit.j5training;

import java.util.Scanner;

public class Check_integer_String {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner scn=new Scanner(System.in);
		if (scn.hasNextInt()) {
			System.out.println("Integer" );
		} else if (scn.hasNextDouble()) {
			System.out.println("Double");
		}else if (scn.hasNext()) {
			System.out.println("Scanner");
		}

	}

}
