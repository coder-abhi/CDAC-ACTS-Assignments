package com.acts.player;

import java.util.Date;

public class Person {
	public String name;
	int age;
	String adress;
	Date dateOfBirth;
	public Person() {
		this.name = "";
		this.age = 0;
		this.adress = "";
	}
	public Person(String name,int age, String adress,Date dateOfBirth) {
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
