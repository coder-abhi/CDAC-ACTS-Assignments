package com.acts.assosiation;

public class Address {
	private String houseNo;
	private String laneNo;
	private String area;
	private String pinCode;
	
	
	public Address() {
		this.houseNo = "" ;
		this.laneNo = "";
		this.area = "";
		this.pinCode = "";
	}


	public Address(String houseNo, String laneNo, String area, String pinCode) {
		this.houseNo = houseNo;
		this.laneNo = laneNo;
		this.area = area;
		this.pinCode = pinCode;
	}


	public String getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}


	public String getLaneNo() {
		return laneNo;
	}


	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public String getString() {
		return "Address : houseNo =" + houseNo + " laneNo =" + laneNo
				+ " area= " + area + " pinCode= " + pinCode ;
	}
	

}
