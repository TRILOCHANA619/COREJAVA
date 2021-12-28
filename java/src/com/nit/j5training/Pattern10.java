package com.nit.j5training;
//Pattern
/* 1	2	3	
   6	5	4	
   7	8	9	
   12	11	10	
   13	14	15	
   18	17	16
*/

public class Pattern10 {

	public static void main(String[] args) {
		int row=6,num=1;
		for (int i = 1; i <=row; i++) {
			if (i%2==0) {
				for (int j = num+2; j >=num; j--) {
					System.out.print(j+"\t");
					
				}
			} else {
				for (int j = num; j <num+3; j++) {
					System.out.print(j+"\t");
					
				}
			}
			num+=3;
			System.out.println();
		}
	}

}
