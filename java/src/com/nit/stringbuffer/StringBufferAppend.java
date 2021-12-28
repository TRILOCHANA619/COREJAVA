package com.nit.stringbuffer;

public class StringBufferAppend {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer(3);
		System.out.println("Sb1 capacity: "+sb1.capacity());
		System.out.println("Sb1 length: "+sb1.length());
		System.out.println("Sb1 : "+sb1);
		System.out.println();
		
		sb1.append("a");
		System.out.println("Sb1 capacity: "+sb1.capacity());
		System.out.println("Sb1 length: "+sb1.length());
		System.out.println("Sb1 : "+sb1);
		System.out.println();
		
		sb1.append(10);
		System.out.println("Sb1 capacity: "+sb1.capacity());
		System.out.println("Sb1 length: "+sb1.length());
		System.out.println("Sb1 : "+sb1);
		System.out.println();
		
		PqR p1=new PqR();
		sb1.append(p1);
		System.out.println("Sb1 capacity: "+sb1.capacity());
		System.out.println("Sb1 length: "+sb1.length());
		System.out.println("Sb1 : "+sb1);
		System.out.println();
		//sb1.append(null);
		sb1.append((String)null);
		System.out.println("Sb1 capacity: "+sb1.capacity());
		System.out.println("Sb1 length: "+sb1.length());
		System.out.println("Sb1 : "+sb1);
		System.out.println();
		
		//sb1.append((char[]) null);   //RE
		
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i <= 20; i++) {
			sb.append(i+" ");
			
		}
		System.out.println("Sb1 capacity: "+sb.capacity());
		System.out.println("Sb1 length: "+sb.length());
		System.out.println("Sb1 : "+sb);
		System.out.println();
	}

}
class PqR{
	@Override
	public String toString() {
		return "hi";

	}
}
