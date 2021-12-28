package com.nit.hk.string.methods;

import java.lang.reflect.Field;

public class Find_Length_Without_Predefined_Method {

	public static void main(String[] args) {
		String s="abc";
		
		//Approach 1: using pre defined method
		System.out.println(s.length());
		
		//Approach 2: using CharAt() method
		int count=0;
		try {
		for (int i = 0; true; i++) {
			s.charAt(i);
			count++;
		}
		}catch (Exception e) {
			System.out.println(count);
		}
		
			//Shorter  method
		count=1;
		try {
		while (true) {
			s.charAt(++count);
		}
		}catch (Exception e) {
			System.out.println(count);
		}
		
		//Approach 3: By using toCharArray()
		char[] ch=s.toCharArray();
		System.out.println(ch.length);
		
		//Approach 4:- By using toByte()
		byte[] b=s.getBytes();
		System.out.println(b.length);
		
		//Approach-5 using split method
		
		String[] chars=s.split("");
		System.out.println(chars.length);
		
		//Approach-6 using reflection api
		Class<?> cls=s.getClass();
		try {
			Field values=cls.getDeclaredField("value");
			values.setAccessible(true);
			try {
				byte[] chr=(byte[])values.get(s);
				System.out.println(ch.length);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

}
