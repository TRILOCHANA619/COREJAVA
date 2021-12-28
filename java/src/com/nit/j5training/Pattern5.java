package com.nit.j5training;

public class Pattern5 {
	public static void main(String[] args) {
		int k=1; //k variavle is fpr print
		for (int i = 0; i < 5; i++) { // for no of row we ue one loop
			for (int j = 0; j <5; j++) {// for printing number we use second loop
				System.out.print(k+"\t");// display the number and \t for tab
				k+=2;
			}
			System.out.println(); //for nextline
		}


	}
}
