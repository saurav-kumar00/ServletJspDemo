package com.ServletJsp.web.Model;

public class Student {
	private int rollno;
	private String sname;
	private int age;
	private int marks;
	private String div;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String string) {
		this.div = string;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", age=" + age + ", marks=" + marks + ", div=" + div
				+ "]";
	}
	
}
