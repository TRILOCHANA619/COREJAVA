package com.nit.hk.collectionproject;

public class Student {
	private int sno;
	private String name;
	private String courseName;
	public Student(int sno, String name, String courseName) {
	
		this.sno = sno;
		this.name = name;
		this.courseName = courseName;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "\nStudent {sno=" + sno + ", name=" + name + ", courseName=" + courseName + "}";
	}
	@Override
	public int hashCode() {
		
		return CourseName.getID(courseName);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student s) {
			return this.courseName.equals(s.courseName) && this.sno==s.sno;
		}
		return false;
	}
	
	
}
