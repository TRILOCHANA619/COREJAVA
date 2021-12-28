package com.nit.j5training;

public class ReturnBoolean {

	boolean mehtod(int[] arr) {
		boolean out=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==2 && arr[i]==3) {
				out=true;
			}
			
		}
		return out;
	}
	public static void main(String[] args) {
		int[] a= {1,2};
	if (new ReturnBoolean().mehtod(a)) {
		System.out.println("Trur");
	}else {
		System.out.println("False");

	}

}

}
