package petstore;

public class Order {
	private static int orderIdCount = 1000;
	private int orderId;
	private int petID;
	private int quantity;
	private Status status;
	
	public Order(int petID, int quantity, Status status) {
		this.orderId = orderIdCount++;
		this.petID = petID;
		this.quantity = quantity;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getPetID() {
		return petID;
	}

	public void setPetID(int petID) {
		this.petID = petID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petID=" + petID + ", quantity=" + quantity + ", status=" + status + "]";
	}
	
}
