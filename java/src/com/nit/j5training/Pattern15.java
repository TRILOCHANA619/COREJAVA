package com.nit.j5training;

//pattern
/*
   	* 
   	* * 
	*   * 
	*     * 
	* * * * * 
 */

public class Pattern15 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			if (i==1 || i==5) {
				for (int j = 1; j <=i; j++) {
					System.out.print("*"+" ");
				}
			} else {

				System.out.print("*"+" ");
				for (int k = 1; k <=i-2; k++) {
					System.out.print("  ");
				}
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}

