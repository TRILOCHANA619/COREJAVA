package com.nit.j5training;

//Printing the number is Palendron or not

import java.util.Scanner;

public class Papandrom {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		int check=number;
		int number2=0;
		while (check%10!=0) {
			int rem=check%10;
			//System.out.println(rem);
			number2=number2*10+rem;
			//System.out.println(number2);
			check=check/10;
			//System.out.println(check);
		}
		if (number==number2) {
			System.out.println("palandrom");
		} else {
			System.out.println("not palandrom");
		}

	}

}
