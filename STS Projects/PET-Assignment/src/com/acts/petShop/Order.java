package com.acts.petShop;

public class Order {
	Integer orderID;
	Integer petID;
	Integer qty;
	Status status;
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public Integer getPetID() {
		return petID;
	}
	public void setPetID(Integer petID) {
		this.petID = petID;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", petID=" + petID + ", qty=" + qty + ", status=" + status + "]";
	}
	public Order(Integer orderID, Integer petID, Integer qty, Status status) {
		super();
		this.orderID = orderID;
		this.petID = petID;
		this.qty = qty;
		this.status = status;
	}
	
	
}
