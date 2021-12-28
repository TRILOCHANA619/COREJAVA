package com.nit.j5training;

public class ReturnArray {

	int[] mehtod() {
		int[] arr= {1 ,2 ,3};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
			}
			
		}
		return arr;
	}
	public static void main(String[] args) {
	for (int arr : new ReturnArray().mehtod()) {
		System.out.print(arr);
	}	

	}

}
