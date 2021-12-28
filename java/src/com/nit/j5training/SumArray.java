package com.nit.j5training;

public class SumArray {
	int mathod(int[] arr) {
		if (arr.length>=2) {
			return arr[0]+arr[1];
		} else if(arr.length==1){
			return 0;
		}else {
		return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(new SumArray().mathod(new int[]{2,3}));

	}

}
