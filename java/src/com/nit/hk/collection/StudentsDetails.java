package com.nit.hk.collection;

public class StudentsDetails {
	private int sno;
	private String sname;
	private String course;
	private double fee;
	
	public StudentsDetails(int sno, String sname, String course, double fee) {
		
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "\nStudentsDetails [sno=" + sno + ", sname=" + sname + ", course=" + course + ", fee=" + fee + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof StudentsDetails s) {
			return this.sno==s.sno && this.course.equals(s.course) ;
		}
		
		return false;
	}
}
