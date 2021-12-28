package com.nit.j5training;

//pattern
/*
 		*****
 		*   *
 		*   *
 		*   *
 		*****
 */

public class Patttern14 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			if (i==1 || i==5) {
				for (int j = 0; j <5; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				System.out.println("*   *");
			}
		}

	}

}
