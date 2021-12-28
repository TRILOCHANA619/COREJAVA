package com.nit.hk.string.pratic;

public class Test06_StringBufferAndStringBuilderTiming {

	public static void main(String[] args) {
		StringBuffer sbf=new StringBuffer();
		StringBuilder sbd=new StringBuilder();
		long time1,time2;
		time1=System.nanoTime();
		for (int i = 1; i < 10000000; i++) {
			sbf.append(" hari ");
		}
		time2=System.nanoTime();
		System.out.println(time2-time1);
		time1=System.nanoTime();
		for (int i = 1; i < 10000000; i++) {
			sbd.append(" hari ");
		}
		time2=System.nanoTime();
		System.out.println(time2-time1);

	}

}
