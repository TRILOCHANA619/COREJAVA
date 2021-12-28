package com.nit.j5batch.oops;

public class VariablExample {

	private static int x;
	private int y;
	public VariablExample() {
		System.out.println(y);
	}
	
	public static void main(String[] args) {
	
		System.out.println(x);
		//System.out.println(y);
		System.out.println(VariablExample.x);
		//System.out.println(VariablExample.y);
		VariablExample ve=new VariablExample();
		System.out.println(ve.x);
		System.out.println(ve.y);

	}

}
