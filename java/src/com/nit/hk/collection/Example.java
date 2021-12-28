package com.nit.hk.collection;

public class Example implements Comparable<Example>{
	private int x;
	private int y;
	public Example(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Example(" + x + "," + y + ")";
	}
	@Override
	public int hashCode() {
		
		return x+y;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Example e) {
			return this.x==e.x && this.y==e.y;
		}
		return false;
	}
	@Override
	public int compareTo(Example e) {
		
		return e.x-this.x;
	}
	
	

}
