package com.nit.j5training;

public class Pattern19 {

	public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		int b=1;
		for (int j = 0; j <6 ; j++) {
			
		if (j%2==0) {
			System.out.print(i+"\t");
		} else {
			System.out.print(b+"\t");
			b++;
		}
		}
		System.out.println();
	}

	}

}
