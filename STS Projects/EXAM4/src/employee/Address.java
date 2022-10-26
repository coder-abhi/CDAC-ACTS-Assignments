package employee;

public class Address {
	private String houseNo;
	private String area;
	private int pincode;
	
	public Address(String houseNo, String area, int pincode) {
		this.houseNo = houseNo;
		this.area = area;
		this.pincode = pincode;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", area=" + area + ", pincode=" + pincode + "]";
	}	
}

