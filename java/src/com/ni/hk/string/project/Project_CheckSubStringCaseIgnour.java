package com.ni.hk.string.project;

import java.util.Scanner;

import com.nit.hk.projectcomponent.JavaTestOperation;

public class Project_CheckSubStringCaseIgnour {

	public static void main(String[] args) {
		try (Scanner scn=new Scanner(System.in)){
			if (scn!=null) {
				System.out.println("Enter the String:- ");
				String s=scn.nextLine();
			
				JavaTestOperation.checkSubStringCase(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
