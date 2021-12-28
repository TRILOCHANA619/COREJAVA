package com.nit.j5training;

public class Pattern21 {

	public static void main(String[] args) {
		int row=5;
		int value=1;
		for (int i = 1; i <=5;i++) {
			for (int j = 1; j <=5; j++) {
				if (i>j) {
					System.out.print("  ");
				} else {
					
						System.out.print(value++);
					
					//System.out.print(value++);
				}
			}
		System.out.println();	
		}


	}

}
