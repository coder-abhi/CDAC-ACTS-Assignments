package com.acts.dmart;

public class Stock {
	private String name;
	private String category;
	private double price;
//	private double discountPrice;
	private double afterTaxPrice;
	private double afterTaxPriceTotal;
	private int qty;
	
	public Stock() {
		
	}

	
	public Stock(String name, String category, double price, int qty){
		this.name = name;
		this.category = category;
		this.price = price;
		this.qty = qty;
	}
	
	public Stock(Stock stock, int i) {
		// TODO Auto-generated constructor stub
		this.name = stock.name;
		this.category = stock.category;
		this.price = stock.price;
		this.qty = i;
	}
	
	public Stock Stock(Stock st,int qty) {
		return new Stock(st.name,st.category,st.price,qty);
	}
	
	
	public double getDiscountPrice() {
		double DiscountPrice = this.afterTaxPrice;
		
		    if(category.equals("Education")) {
		    	DiscountPrice *= 0.8;	
		    }
		    if(category.equals("Clothing")) {
		    	DiscountPrice *= 0.9;	
		    }
		    if(category.equals("Accesories")) {
		    	DiscountPrice *= 0.85;	
		    }
		   
		return DiscountPrice;
	}
	
	public double applyTax() {
		afterTaxPrice = price * 1.05;
		double currentPrice = price * qty;
		afterTaxPriceTotal = currentPrice * 1.05;
		System.out.println(" ".repeat(6) +Formater.formate(currentPrice+"",20)  + Formater.formate(currentPrice*0.025+"",15) + 
				Formater.formate(currentPrice*0.025+"",10) + Formater.revFormate(afterTaxPriceTotal+"", 10) );
		return afterTaxPriceTotal;
	}
	
	public double getAfterTaxPrice() {
		return afterTaxPriceTotal;
	}
	

	@Override
	public String toString() {
		return Formater.formate(name, 20) + Formater.formate(category, 20) + Formater.formate(""+qty, 10) + Formater.revFormate(""+price, 10);
//		return "Product=" + name + ", category=" + category + ", price=" + price + ", qty=" + qty + "]";
	}
	
	public String toStringForBill() {
		return Formater.formate(name, 20) + Formater.formate(category, 20) + Formater.formate(""+qty, 12) 
		+Formater.formate(""+price, 12)  + Formater.revFormate(""+(price*qty), 10);
//		return "Product=" + name + ", category=" + category + ", price=" + price + ", qty=" + qty + "]";
	}
	
	public void purchased(int qty) {
		this.qty -= qty;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}
	



	
	
}
