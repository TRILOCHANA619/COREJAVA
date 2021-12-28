package com.nit.j5training;

public class Patern09 {

	public static void main(String[] args) {
		int k=1;
		int m=9;
		int n=1;
		for (int i = 0; i < 5; i++) { // for no of row we ue one loop
			int l=k;
			
			for (int j=0; j <5; j++) {// for printing number we use second i
				
				if(j%2==0) {
				
				System.out.print(l+"\t");// display the number and \t for tab
				
				
				
				l=l+m;
		
				}else {
					System.out.print(l+"\t");// display the number and \t for tab
				l=l+n;
				
				}
				
				
			}
			k+=1;
			n+=2;
			m-=2;
			
			System.out.println(); //for nextline
		}
		

	}

}
