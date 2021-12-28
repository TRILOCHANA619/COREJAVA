package com.ni.hk.string.project;

import java.util.Scanner;

import com.nit.hk.projectcomponent.JavaTestOperation;

public class Print_No_Of_Occurance_And_Inde {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String:-");
		String s=scn.nextLine();
		JavaTestOperation.printIndexAndOccurance(s);
		scn.close();
	}

}
