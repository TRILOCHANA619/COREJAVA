package com.nit.j5training;

import java.util.Scanner;
//Check the given value is integer or character or String

public class Check_Integer_Or_String_Or_Char {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		
		//try block for the check integer
		try { 
			Double num=Double.parseDouble(s);
			System.out.println("It is a number");
		//If not Integer theen check for char in catchblock
		} catch (Exception e) {
			//check for chaar
			s=s.trim();
				if (s.length()==1) {
					char ch=s.charAt(0);
					System.out.println("It is a chaecter::");
				} else if(s.length()==0){   //check for String
					System.out.println("NULL");
				}else if(s.equalsIgnoreCase("true" )|| s.equalsIgnoreCase("false")) {
					System.out.println("it is a boolean");
				}else {
					System.out.println("it is a string");
				}
			
		}

	}

}
