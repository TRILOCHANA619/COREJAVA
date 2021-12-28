package com.nit.j5batch.oopsstudent;


import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Entetr the no of student to be insert");
		int noOfStudent=scn.nextInt();
		Student students[]=new Student[noOfStudent];
		
		//for storing the details in arraay
		for (int i = 0; i <students.length; i++) {
			System.out.println("Enter "+(i+1)+ " studdent roll number:- ");
			int rollNo=scn.nextInt();
			scn.nextLine();
			System.out.println("Enter "+(i+1)+" studdent name:- ");
			String name=scn.nextLine();
			students[i]=new Student(rollNo, name);
		}
		scn.close();
		
		//for getting the details
		for (int i = 0; i <students.length; i++) {
			System.out.println((i+1)+" == Student details");
			students[i].display();
		}

	}

}
