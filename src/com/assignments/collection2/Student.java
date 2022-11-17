package com.assignments.collection2;

public class Student {
	private int rollno;
	private String name;
	private String className;
	private int totalMarks;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Student(int rollno, String name, String className, int totalMarks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.className = className;
		this.totalMarks = totalMarks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", className=" + className + ", totalMarks="
				+ totalMarks + "]";
	}
	
	

}
