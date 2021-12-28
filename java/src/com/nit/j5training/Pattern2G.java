package com.nit.j5training;
//Pattern
/*
  5
  4 5
  3 4 5
  2 3 4 5
  1 2 3 4 5
 */

public class Pattern2G {

	public static void main(String[] args) {
		int number=5;
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print((number+j)+" ");
			}
			System.out.println();
			number--;
		}

	}

}
