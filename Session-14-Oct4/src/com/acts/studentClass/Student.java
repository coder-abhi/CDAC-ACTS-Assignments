package com.acts.studentClass;

public class Student extends Person{
	int PRN;
	String course;
	boolean feesPaid;
	int score;
	
	public Student() {
		this(-1,"Not Defined",false,-1);
	}
	 public Student(int PRN, String course, boolean feesPaid, int score) {
		 this.PRN = PRN;
		 this.course = course;
		 this.feesPaid = feesPaid;
		 this.score = score;
	 }
	 
	public void PrintStudent() {
		System.out.println("PRN : "+PRN+"\t Course : "+course+"\t Score : "+score);
	}
	
	public void canLearn() {
		System.out.println(name+" can Learn !!!");
		
	}
	@Override
	public void canWalk() {
		System.out.println(name+" can Walk ##");
		
	}
	
//	public String toString() {
//		return "PRN : "+PRN+"\t Course : "+course+"\t Score"+score;
//	}
}
