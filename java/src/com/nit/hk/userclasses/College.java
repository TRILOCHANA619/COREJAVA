package com.nit.hk.userclasses;

import java.util.HashMap;

import com.nit.hk.collectionproject.Address;
import com.nit.hk.collectionproject.Student;

public class College {

	public static void main(String[] args) {
		HashMap<Student,Address> studentMap=new HashMap<>();
		
		studentMap.put(new Student(101, "PAPU", "core java"), new Address("cuttack", "Odisha"));
		studentMap.put(new Student(101, "MANTU", "cpp"), new Address("choudwar", "Odisha"));
		studentMap.put(new Student(103, "BAGA", "core java"), new Address("Bhubaneswer", "Odisha"));
		studentMap.put(new Student(102, "ASIT", "Advjava"), new Address("cuttack", "Odisha"));
		studentMap.put(new Student(105, "BANI", "python"), new Address("Rairangpur", "Odisha"));
		studentMap.put(new Student(105, "suchi", "python"), new Address("Rairangpur", "Odisha"));

		System.out.println(studentMap);
		int a=(int)888.8;
		byte b=(byte)100l;
		long l=(byte)100;
		byte z=(byte)100L;
		System.out.println(a);
		System.out.println(b);
		System.out.println(l);
		System.out.println(z);
	}

}
