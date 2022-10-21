package accountUpdateCase1;

public class Account {
	private int balance;
	public Account(int balance) {
		this.balance = balance;
	}
	public synchronized void Withdrow(int num) {
		this.balance -= num;
	}
	public synchronized void Deposite(int num) {
		this.balance += num;
	}
	public synchronized int checkBalance() {
		return this.balance;
	}
}
