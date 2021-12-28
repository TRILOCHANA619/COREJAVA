package com.nit.j5batch.oopsstudent;

import java.util.Scanner;

public class MainCLassSetterGetter {


	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Entetr the no of student to be insert");
		int noOfStudent=scn.nextInt();
		Students students[]=new Students[noOfStudent];

		//for storing the details in arraay
		for (int i = 0; i <students.length; i++) {
			System.out.println("Enter "+(i+1)+ " studdent roll number:- ");
			int rollNo=scn.nextInt();
			scn.nextLine();
			System.out.println("Enter "+(i+1)+" studdent name:- ");
			String name=scn.nextLine();
			students[i]=new Students();
			students[i].setName(name);
			students[i].setRollNo(rollNo);;
		}
		scn.close();

		//for getting the details
		for (int i = 0; i <students.length; i++) {
			System.out.println((i+1)+" == Student details");
			System.out.println(students[i].getName());
			System.out.println(students[i].getRollNo());
		}



	}

}
