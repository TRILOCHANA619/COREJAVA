package com.ni.hk.string.project;

import java.util.Scanner;

import com.nit.hk.projectcomponent.JavaTestOperation;

public class Project_CheckPassword {

	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in);) {
			if (scn!=null) {
				System.out.println("enter the pasword:-");
				String s=scn.nextLine();
				JavaTestOperation.checkNumberOfCharacter(s);
			}//if
		} catch (Exception e) {
			e.printStackTrace();
		}//catch

	}

}
