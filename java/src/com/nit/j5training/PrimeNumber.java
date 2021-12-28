package com.nit.j5training;

import java.util.Scanner;
//print prime number to user  given number
public class PrimeNumber {

	//method to printthe number
	public static void printPrimeNumber(int num) {
	boolean flag;
		for (int i=1;i<=num ;i++ )
			//collecting the number from 1 to given number
		{
				
			//checking  the number is 1 or not
			if (i==1)
			{
				System.out.println( " 1 is neither a prime nor a Not prime  number");
			}else{
				
				//checking the prime number or ot
				
				flag=false;
				for (int j=2;j<i ;j++ )
				{
					//System.out.println("hi1");
					if (i%j==0){
						//System.out.println("hi2");
						flag=true;
						break;
					}
					//System.out.println("hi3");
					
				}//inner for
				//System.out.println("hi4");
				if (flag)
					{
						//System.out.println(i+ " is not prime number");
						//flag=false;
					}else{
						System.out.println(i+ " is prime number");
					}
				
					
			}// outer else
			flag=false;
			
		}//for
	}//printPrimeNumber
		
	public static void main(String[] args) {
		//read input from user
		Scanner scn=new Scanner(System.in);
		//calling  the method to print the numbers to the given umber
		printPrimeNumber(scn.nextInt());
		scn.close();
		System.out.println();

	}

}

