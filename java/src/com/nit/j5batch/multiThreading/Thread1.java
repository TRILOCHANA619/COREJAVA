package com.nit.j5batch.multiThreading;

public class Thread1 extends Thread{
	

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread1 class run method");
			System.out.println("State name"+getState());
		}
	}
}
