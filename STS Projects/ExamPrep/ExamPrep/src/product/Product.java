package product;

import java.time.LocalDate;

public class Product {
	private int id;
	private String name;
	private Category productCategory;
	private LocalDate manufacturingDate;
	private double price;
	
	
	public Product(int id, String name, Category productCategory, LocalDate manufacturingDate, double price) {
		this.id = id;
		this.name = name;
		this.productCategory = productCategory;
		this.manufacturingDate = manufacturingDate;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Category getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}


	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}


	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", productCategory=" + productCategory + ", manufacturingDate="
				+ manufacturingDate + ", price=" + price + "]";
	}
}
