package com.nit.j5training;


public class Pattern17 {

	public static void main(String[] args) {
		int a=4;
		int b=0;
		int c=8;
		int d=0;
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 9; j++) {
				if (i%2==0) {
					a=a*3;
					System.out.println(a+2);
					
				} else {
					System.out.println(c+1);
				}
			}
		}

	}

}
