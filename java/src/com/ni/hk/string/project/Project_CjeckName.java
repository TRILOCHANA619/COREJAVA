package com.ni.hk.string.project;

import java.util.Scanner;

import com.nit.hk.projectcomponent.JavaTestOperation;

public class Project_CjeckName {

	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in);) {
			if (scn!=null) {
				System.out.println("enter the String:-");
				String s=scn.nextLine();
				System.out.println(JavaTestOperation.checkName(s));
			}//if
		} catch (Exception e) {
			e.printStackTrace();
		}//catch

	}

}
