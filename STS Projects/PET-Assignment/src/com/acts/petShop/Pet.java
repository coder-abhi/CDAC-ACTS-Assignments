package com.acts.petShop;

public class Pet {
	Integer petID;
	String name;
	Category category;
	Double unitPrice;
	Integer stock;
	
	
	
	
	public Integer getPetID() {
		return petID;
	}
	public Pet(Integer petID, String name, Category category, Double unitPrice, Integer stock) {
		super();
		this.petID = petID;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stock = stock;
	}
	public void setPetID(Integer petID) {
		this.petID = petID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Pet [petID=" + petID + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stock=" + stock + "]";
	}
	
	
	
	
	
}
