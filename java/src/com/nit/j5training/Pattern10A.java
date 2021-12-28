package com.nit.j5training;

public class Pattern10A {
	
	public static void main(String[] args) {
		int x=1;
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if (i%2!=0) {
					System.out.print(x++ +"\t");
				} else {
					System.out.print(--x +"\t");
				}
			}
			x+=n;
			System.out.println();
		}
	}

}
