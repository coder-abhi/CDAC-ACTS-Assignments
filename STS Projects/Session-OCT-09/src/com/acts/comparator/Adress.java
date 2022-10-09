package com.acts.comparator;

public class Adress {
	String lane1;
	String lane2;
	
	public Adress(String lane1, String lane2) {
		super();
		this.lane1 = lane1;
		this.lane2 = lane2;
	}

	@Override
	public String toString() {
		return "Adress [lane1=" + lane1 + ", lane2=" + lane2 + "]";
	}
	
}
