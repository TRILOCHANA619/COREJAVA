package com.nit.j5batch.inheritanceconcept;

public abstract class Luxury implements Car {

	@Override
	public void start() {
		System.out.println("remote key start");

	}

	@Override
	abstract public void breaks(); 
}
