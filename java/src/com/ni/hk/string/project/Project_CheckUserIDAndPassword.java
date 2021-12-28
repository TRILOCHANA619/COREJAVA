package com.ni.hk.string.project;

import java.util.Scanner;

import com.nit.hk.projectcomponent.JavaTestOperation;

public class Project_CheckUserIDAndPassword {

	public static void main(String[] args) {
		
		try (Scanner scn=new Scanner(System.in)){
			if (scn!=null) {
				System.out.println("Enter the userID:- ");
				String userId=scn.nextLine();
				System.out.println("Enter the password:-");
				String password=scn.nextLine();
				JavaTestOperation.checkID(userId, password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
