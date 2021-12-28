package com.nit.j5training;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		Student student=new Student();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the name of the Student");
		String name=scn.nextLine();
		System.out.println("Enter the roll number of the Student");
		int rollno=scn.nextInt();
		scn.nextLine();
		System.out.println("Enter the address of the Student");
		String address=scn.nextLine();
		
		try {
		student .setRollno(rollno);
		student.setName(name);
		student.setAddress(address);
		
		System.out.println("student details are \n");
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		System.out.println(student.getRollno());

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		scn.close();
	}

}
