package com.ni.hk.string.project;

import java.util.Scanner;

import com.nit.hk.projectcomponent.JavaTestOperation;

public class Project_String_Palandrom_Or_Not {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string:- ");
		String s=scn.nextLine();
		JavaTestOperation.palandrom(s);

	}

}
