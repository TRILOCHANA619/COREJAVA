package com.nit.j5training;

public class StringPractic1 {
 int rollno;
 String name;
 String city;
public StringPractic1(int rollno, String name, String city) {
	
	this.rollno = rollno;
	this.name = name;
	this.city = city;
}
public static void main(String[] args) {
	StringPractic1 s1=new StringPractic1(101, "ANuj", "cuttack");
	StringPractic1 s2=new StringPractic1(102, "Vijay", "Gaziabad");
	System.out.println(s1);
	System.out.println(s2);
}
//@Override
//public String toString() {
//	return "StringPractic1 [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
//}

 
}
