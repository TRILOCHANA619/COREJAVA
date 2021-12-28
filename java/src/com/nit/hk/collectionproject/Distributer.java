package com.nit.hk.collectionproject;

import java.util.Scanner;

public class Distributer {

	public static void main(String[] args) {
		CylinderDistribute distributer=new CylinderDistribute();
		
		Scanner scn=new Scanner(System.in);
		
		
		int count=0;
		boolean next=true;
		while (next) {
			System.out.println("Enter the name of the person");
			distributer.setCustomerName(scn.nextLine());
			System.out.println("Ente the Id ");
			distributer.setCustId(scn.nextInt());
			scn.nextLine();
			count++;
			System.out.println("Mor people are There ? type y/n");
			String option=scn.nextLine();
			if (option.equalsIgnoreCase("n")) {
				next=false;
			}
		}
		
			
		
		
		
			distributer.distributeByName();	
		
		
			distributer.distributeById();
			
		
		
		

	}

}
