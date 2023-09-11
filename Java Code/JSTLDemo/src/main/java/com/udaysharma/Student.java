package com.udaysharma;

public class Student {
	String name;
   public String getName() {
		return name; }
	public void setName(String name) {
		this.name = name; }
	public int getRollno() {
		return rollno;  }
	public void setRollno(int rollno) {
		this.rollno = rollno; }
int rollno;
   public Student(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}
@Override
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + "]";
}   
}
