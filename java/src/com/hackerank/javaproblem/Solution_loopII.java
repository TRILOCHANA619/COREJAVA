package com.hackerank.javaproblem;

import java.util.*;
import java.io.*;

class Solution_loopII{
    static int number;
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result=0;
            for(int j=0;j<=n-1;j++){
            	int result2=0;
            	for (int k = 0; k<=j; k++) {
            		result2=result2+(power(k)*b);
				}
                result=result2+a;
                System.out.print(result+" ");
               
            }
        }
        in.close();
    }
    private static int power(int number){
        int res=1;
        for(int i=0;i<=number;i++){
            if(i==0){
                res= 1;
            }else {
              res=res*2;
            }
        }
		return res;
    }
}