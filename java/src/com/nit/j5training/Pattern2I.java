package com.nit.j5training;

//Pattern 8

/* 1
 * 3 5
 * 5 7 9
 * 7 9 11 13
 * 9 11 13 15 17
 */

public class Pattern2I {

	public static void main(String[] args) {
		int num=1;
		for (int i = 0; i <5; i++) {
			int number=num;
			for (int j = 0; j <=i; j++) {
				System.out.print((number)+"\t");
				number+=2;
			}
			System.out.println();
			num+=2;
			
		}

	}

}
