package com.nit.j5training;
//Pattern

/* 5
   4 4
   3 3 3
   2 2 2 2
   1 1 1 1 1
 */

public class Pattern2F {

	public static void main(String[] args) {
		int number=5;
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print((number-i)+" ");
			}
			System.out.println();
		}
	}

}
