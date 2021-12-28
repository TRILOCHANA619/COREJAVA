package com.nit.j5training;

//pattern
/*
   	A
	BB
	CCC
	DDDD
	EEEEE
 */
public class Patern11 {

	public static void main(String[] args) {
		int ch=65;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print((char)ch);
			}
			ch+=1;
			System.out.println();
		}

	}

}
