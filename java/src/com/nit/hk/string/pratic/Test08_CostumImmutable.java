package com.nit.hk.string.pratic;
class Ex{
	private  int x;
	public Ex(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
	public void modify(int x) {
		this.x=this.x+x;
	}
	@Override
	public String toString() {
		return ""+x;
	}
}

class Sa{
	private final int x;
	public Sa(int x) {
		this.x=x;
	}
	public Sa modify(int x) {
		return new Sa(this.x+x);
	}
	@Override
	public String toString() {
		return ""+x;
	}
}

public class Test08_CostumImmutable {

	public static void main(String[] args) {
		Ex e=new Ex(5);
		System.out.println(e);
		e.modify(4);
		System.out.println(e);
		System.out.println();
		
		Sa s=new Sa(6);
		System.out.println(s);
		s.modify(4);
		System.out.println(s);
		System.out.println();
		
		Sa s1=s.modify(4);
		System.out.println(s);
		System.out.println(s1);
		
		

	}

}
