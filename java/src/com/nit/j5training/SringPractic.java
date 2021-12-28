package com.nit.j5training;

/*
 
  toString()
  hashCode()
  isEmpty();
  intern();
  
  
 */

import java.util.Scanner;

public class SringPractic {

	int mobno;
	String givenString;
	String wish;
	//Constructor for  Initialize the instance variable
	public SringPractic(int mobno, String givenString, String wish) {
		this.mobno = mobno;
		this.givenString = givenString;
		this.wish = wish;
	}

	public static void main(String[] args) {
		
		
		//to string method  is used to convert or return string output
		//hashcode() used to return the hashcode of the object
		//is empty chck wheather the sting is empty or not
		SringPractic sp=new SringPractic(36353262, "hi ", "good afternoon");
		System.out.println(sp);
		
		//isEmpty
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String :: ");
		String s=scn.nextLine();
		if (s.isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.println(" not empty");
		}
		System.out.println("Enter the String for intern :: ");
		String intn=scn.nextLine();
		String intn1=scn.nextLine();
		//intern()-- simply if we want to store the string in string pool area then we need intern().
		System.out.println(intn==intn1);
		intn=intn.intern();
		intn1=intn.intern();
		System.out.println(intn==intn1);
		
		
	}

	@Override
	public int hashCode() {
		return 16;
	}

	

	@Override
	public String toString() {
		return "SringPractic [mobno=" + mobno + ", givenString=" + givenString + ", wish=" + wish + "]";
	}
	
	

}
