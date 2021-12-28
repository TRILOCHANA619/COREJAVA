package com.nit.j5training;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) throws IOException {
		System.out.println("""
				Select the option 
				if your  teacher select 1
				if you are student select 2
				""");
		Scanner scn=new Scanner(System.in);
		int option=scn.nextInt();
		scn.nextLine();
		switch (option) {
		case 1 : {
			System.out.println("Enter the Your username");
			String tName=scn.nextLine();
			System.out.println("Enter the Your  password");
			String tPassword=scn.nextLine();
			System.out.println(tName+"  "+tPassword);
			FileInputStream fost=new FileInputStream("D:\\01cj\\IO Stream\\login.txt");
			Scanner sc=new Scanner(fost);
			System.out.println(sc.nextLine()+" "+sc.nextLine());
			break;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
		

	}

}
