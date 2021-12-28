package com.hackerank.javaproblem;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BigIntegerClass {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        BigInteger b1=new BigInteger(scn.nextLine());
        BigInteger b2=new BigInteger(scn.nextLine());
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}