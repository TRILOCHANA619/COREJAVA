package com.nit.j5training;

import java.util.Scanner;
//print 1 to 10 numbers in following format
// 1 2 3 4 5 6 78 9 10
public class PrintNumberInLine {

	//method to printthe number
	public static void printNumber(int a) {
		for (int i = 1; i <=a; i++) {
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		//read input from user
		Scanner scn=new Scanner(System.in);
		//clling  the method to print the numbers to thegiven umber
		printNumber(scn.nextInt());

	}

}
