package com.nit.j5batch.oops;

public class Toy {

	Toy(){
		System.out.println(getToyCost());
	}

	public double getToyCost() {
		return 100.0;
	}
	public static String getToyName() {
		return "car";
	}
	public static void main(String[] args) {
		System.out.println(getToyName());	//without name/object
		//System.out.println(getToyCost());
		System.out.println(Toy.getToyName());//with name
		//System.out.println(Toy.getToyCost());
		Toy t=new Toy();					//calling getToyCost() withput name and oject
		System.out.println(t.getToyName());//with onject
		System.out.println(t.getToyCost());//with object reference
	}

}
