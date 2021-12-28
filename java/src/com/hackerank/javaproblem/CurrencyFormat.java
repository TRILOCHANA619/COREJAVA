package com.hackerank.javaproblem;

import java.util.*;
import java.text.*;

public class CurrencyFormat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        NumberFormat usa= NumberFormat.getCurrencyInstance(Locale.US);
        String us=usa.format(payment);
        NumberFormat in= NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india=in.format(payment);
        NumberFormat fr= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=fr.format(payment);
        NumberFormat chi= NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=chi.format(payment);
		System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}