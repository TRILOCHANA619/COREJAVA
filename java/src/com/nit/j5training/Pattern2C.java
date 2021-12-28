package com.nit.j5training;
//Pattern

/* 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */

public class Pattern2C {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
