package com.nit.hk.string.methods;

public class Example {
	private int x;
	
	public Example(int x) {
		this.x=x;
	}
	//printing string character by override the toString method
	@Override
	public String toString() {
		// Printing the string
		//return ""+x;
		//return String.valueOf(x);
		return Integer.toString(x);
	}
}