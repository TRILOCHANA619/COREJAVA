package com.nit.hk.collection;

public class ex {
	private int i;
	private int j;
	public ex(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	@Override
	public String toString() {
		return "ex [i=" + i + ", j=" + j + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ex e) {
			return this.i==e.i && this.j==e.j;
		}
		return super.equals(obj);
	}

}
