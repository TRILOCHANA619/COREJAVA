package com.ni.hk.string.project;

import java.util.Scanner;

import com.nit.hk.projectcomponent.JavaTestOperation;

public class Project_CheckHariIsAvailable {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string:- ");
		String s1= scn.nextLine();
		JavaTestOperation.checkHariOrNot(s1);
		scn.close();

	}

}
