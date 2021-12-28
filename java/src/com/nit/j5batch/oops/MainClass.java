package com.nit.j5batch.oops;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Vehicle v=new Car(); //loose coupling
		Vehicle v1=new Bike();//loose coupling
		v.start(15241);
		v1.start(12359);
		
		Car car=new Car();//tight coupling
		Bike bike=new Bike();//tight coupling
		car.start(25896);
		bike.start(36985);

	}

}
