package com.nit.hk.collectionproject;

import java.util.Vector;

import com.nit.hk.collection.StudentsDetails;

public class SearchProject {
	public static void main(String[] args) {
		Vector<StudentsDetails> cv =new Vector<>();
		System.out.println(cv.capacity());
		System.out.println(cv.size());
		System.out.println(cv);
		
		cv.add(new StudentsDetails(101, "hk", "core Java", 2500));
		cv.add(new StudentsDetails(102, "Natraj", "Advance java", 2500));
		cv.add(new StudentsDetails(101, "Vainkat", "core Java", 3000));
		cv.add(new StudentsDetails(103, "K.V.rao", "Python", 5000));
		
		System.out.println(cv);
		System.out.println();
		
		if (cv.contains(new StudentsDetails(101, "hk", "core Java", 2500))) {
			System.out.println("Available");
			System.out.println(cv.indexOf(new StudentsDetails(101, "hk", "core Java", 2500)));
			System.out.println(cv.get(cv.indexOf(new StudentsDetails(101, "hk", "core Java", 2500))));
		} else {
			System.out.println("! Available");
		}
		
		int[] a= {3,5,6,7,8};
		System.out.println(a.toString());
	}
	
	
}
