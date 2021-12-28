package com.nit.j5training;

public class Pattern8 {

	public static void main(String[] args) {
		int m = 1;
		int n=5;

		for (int i = n; i >= 1; i--) {

			for (int j = n - 1; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(m+++" ");


			}
			m = m-1;
			System.out.println();
		}
	}
}


