package com.ni.hk.string.project;

import java.util.Scanner;

import com.nit.hk.projectcomponent.JavaTestOperation;

public class PrintNoOfCharacterAndLength {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String:- ");
		String s=scn.nextLine();
		JavaTestOperation.printLengthChar(s);
		scn.close();

	}

}
