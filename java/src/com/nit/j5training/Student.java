package com.nit.j5training;

public class Student {

	private int rollno;
	private String name;
	private String address;
	
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) throws Exception {
		if (rollno<=0) {
			throw new  Exception("You cant enter negative number");
			
		} else {
			this.rollno = rollno;
		}

	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name.toUpperCase();
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address.toUpperCase();
	}


}
