package com.acts.studentClass;

public abstract class Person implements Walkable{
	String name;
	int age;
	String adress;
	public Person() {
		this.name = "Abhishek";
		this.age = 0;
		this.adress = "";
	}
	public Person(String name,int age, String adress) {
		this.name = name;
		this.age = age;
		this.adress = adress;
	}
	public void PrintName() {
		System.out.println(this.name);
	}
	
	public abstract void canLearn() ;
}
