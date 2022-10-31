package petstore;

public class Pet {
	private static int petIdCount = 100;
	private int petId;
	private String name;
	private PetCategory category;
	private int unitPrice;
	private int stock;
	
	public Pet(String name, PetCategory category, int unitPrice, int stock) {
		this.petId = petIdCount++;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stock = stock;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PetCategory getCategory() {
		return category;
	}

	public void setCategory(PetCategory category) {
		this.category = category;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stock=" + stock + "]";
	}
	
}
