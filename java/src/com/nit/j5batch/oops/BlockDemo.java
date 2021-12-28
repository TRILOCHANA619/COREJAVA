package com.nit.j5batch.oops;

public class BlockDemo {

	static {
		System.out.println("BlockDemo.static block 2");
	}
	static {
		System.out.println("BlockDemo.static block 1");
	}
	
	static {
		System.out.println("BlockDemo.static block 3");
	}
	 {
			System.out.println("BlockDemo.instance initializer block 2");
		}
	 {
		System.out.println("BlockDemo.instance initializer block 1");
	}
	
	 {
		System.out.println("BlockDemo.instance initializer block 3");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		new BlockDemo();
		System.out.println("main End");


	}

}
