package com.ni.hk.string.project;

import java.util.Scanner;

import com.nit.hk.projectcomponent.JavaTestOperation;


public class Project_EmptyOrNot {

	public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter the  User Name:-");
			String s1=scn.nextLine();
			JavaTestOperation.checkEmpty(s1);
			JavaTestOperation.checkBlank(s1);
			scn.close();

	}

}
