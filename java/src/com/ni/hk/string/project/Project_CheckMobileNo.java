package com.ni.hk.string.project;

import java.util.Scanner;

import com.nit.hk.projectcomponent.JavaTestOperation;

public class Project_CheckMobileNo {

	public static void main(String[] args) {
		try(Scanner scn=new Scanner(System.in);) {
			if (scn!=null) {
				System.out.println("enter the Mobile number:-");
				String s=scn.nextLine();
				JavaTestOperation.checkMobileNumber(s);
			}//if
		} catch (Exception e) {
			e.printStackTrace();
		}//catch


	}

}
