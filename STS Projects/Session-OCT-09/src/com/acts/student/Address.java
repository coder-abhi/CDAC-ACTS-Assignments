package com.acts.student;

public class Address {
	private String line1;
	private String line2;
	private String line3;
	private String pinCode;
	
	
	public Address() {
	}
	
	public Address(String line1, String line2, String line3, String pinCode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.pinCode = pinCode;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getLine3() {
		return line3;
	}
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	@Override
	public String toString() {
		return SFormat.strFormat(line1+""+",", 5) + SFormat.strFormat(line2+""+",", 5) +
				SFormat.strFormat(line3+""+",", 10) +SFormat.strFormat(pinCode+"",10);
	}


	
	

}