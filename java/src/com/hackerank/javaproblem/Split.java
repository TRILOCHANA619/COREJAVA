package com.hackerank.javaproblem;


import java.util.*;

public class Split {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
       if(s.trim().length()>1) {
        String[] token=s.trim().split("[ !,?._'@]+"); //here for multiple regex we use [] like [ regexr1regex2]
        System.out.println(token.length);
        System.out.println(); 					//and "+" operator is for " if there more regex then it work like one"
        for (String string : token) {			//i.e " I am boy, but" here , and space bothe are present to say them both work
			System.out.println(string);			//as one we use + operator
		}
        scn.close();
    } else
    	System.out.println(0);
    }
}