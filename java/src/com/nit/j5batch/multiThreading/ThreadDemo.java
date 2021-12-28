package com.nit.j5batch.multiThreading;

public class ThreadDemo extends Thread {
	private String firstName;
	private String lastName;
	private long awhile;
	public ThreadDemo(String firstName, String lastName, long delay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.awhile = delay;
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				System.out.print(firstName);
				sleep(awhile);
				System.out.print(lastName);
			}
		} catch (InterruptedException e) {
			System.out.println(firstName+" "+lastName+" "+e.getMessage());
		}
	}

}
