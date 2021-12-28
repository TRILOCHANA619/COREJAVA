package com.nit.j5batch.multiThreading;

public class ThreadTest {
	public static void main(String[] args) {
		Thread1 th=new Thread1();
		Thread th1= new Thread(th);
		th1.start();
		Thread.currentThread().setPriority(9);
		Thread.currentThread().setName("hari");;
		th1.setName("Thread 1");
		System.out.println("No of thread is "+Thread.activeCount());
		System.out.println();
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i <5; i++) {
			System.out.println("main method thread");
		}
		
		Car c=new Car("hari", 1);
		c.name();
		c.no();
		c.name(); 
	}
}
