package com.nit.stringbuffer;

public class SetLength {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("abc");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println();
		
		sb.setLength(6);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println("is it \\0 : "+String.valueOf(sb.charAt(3)).equals("\0"));
		System.out.println();
		
		sb.append("def");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println();
		
		StringBuffer sb2=new StringBuffer(7);
		sb2.append("abc");
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2);
		System.out.println();
		
		sb2.setLength(5);					// New length=Current Length----->no change
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2);
		System.out.println();
		
		sb2.setLength(2);					//New length<Current Length--->the rest of char after new lenght
		System.out.println(sb2.capacity()); //								will remove	
		System.out.println(sb2.length());
		System.out.println(sb2);
		System.out.println();
		
		sb2.setLength(5);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2);
		System.out.println();
		
		sb2.setLength(0);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2);
		System.out.println();
		
		/*sb2.setLength(-5);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2);
		System.out.println();*/

		sb2.setLength(19);					// New Length=Current Length---> Change length with \0- null character
		System.out.println(sb2.capacity());			
		System.out.println(sb2.length());
		System.out.println(sb2);
		System.out.println();
	}

}
