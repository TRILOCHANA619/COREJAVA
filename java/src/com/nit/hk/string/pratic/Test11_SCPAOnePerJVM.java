package com.nit.hk.string.pratic;

class C{
	static String s1="a";
}

class B{
	static String s2="b";
}

public class Test11_SCPAOnePerJVM {

	public static void main(String[] args) {
		System.out.println(C.s1==B.s2);

	}

}
