package bookshop;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
	private String title;
	private String author;
	private double price;
	private CategoryType category;
	private LocalDate publishDate;

	public Book(String title, String author,double price, CategoryType category, LocalDate publishDate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
		this.publishDate = publishDate;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CategoryType getCategory() {
		return category;
	}
	public void setCategory(CategoryType category) {
		this.category = category;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", category=" + category
				+ ", publishDate=" + publishDate + "]";
	}
}
