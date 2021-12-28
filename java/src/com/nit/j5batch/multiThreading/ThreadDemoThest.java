package com.nit.j5batch.multiThreading;

import java.io.IOException;

import com.nit.j5training.DisplayLastSecondAndLastThirdelement;

public class ThreadDemoThest {

	public static void main(String[] args) {
		Thread firast=new ThreadDemo("A","a",200l);
		Thread second=new ThreadDemo("B","b",300l);
		Thread third=new ThreadDemo("C","c",500l);
		

		System.out.println("Press enter when y have enogh");
		firast.setDaemon(true);
		second.setDaemon(true);
		third.setDaemon(true);
		firast.start();
		second.start();
		third.start();
		try {
			System.in.read();
			System.out.println("Enter passed...\n");
			
		} catch (IOException e) {
			e.getMessage();
		}
	}

}
