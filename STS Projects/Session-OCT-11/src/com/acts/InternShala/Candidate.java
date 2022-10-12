package com.acts.InternShala;
import com.acts.student.Address;

import java.time.LocalDate;

public class Candidate {
	private Integer regNo;
	private String name;
	private String email;
	private String pass;
	private LocalDate DOB;
	private Long adhaar;
	
	public Candidate() {
	}
	public Candidate(int regNo, String name, String email, String pass, LocalDate DOB, Long adhaar) {
		this.regNo = regNo;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.DOB = DOB;
		this.adhaar = adhaar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Candidate [regNo=" + regNo + ", name=" + name + ", email=" + email + ", pass=" + pass + ", DOB=" + DOB
				+ ", adhaar=" + adhaar + "]";
	}
	public Integer getRegNo() {
		return this.regNo;
	}
	
	@Override
	public int hashCode() {
		return 91* name.hashCode() * regNo.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// checking null
		if(obj == null) return false;
		
		// checking class
		if(this.getClass() == obj.getClass()) return true;
		
		// checking self reference
		if(this == obj) return false;
		
		Candidate cd = (Candidate) obj;
		return this.name.equals(cd.getName()) && this.regNo == cd.getRegNo();
		
	}

}
