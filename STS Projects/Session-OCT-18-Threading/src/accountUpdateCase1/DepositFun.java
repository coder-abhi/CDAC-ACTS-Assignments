package accountUpdateCase1;

public class DepositFun implements Runnable {
	Account account;
	int amount;
	public DepositFun(Account account,int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		account.Deposite(amount);
	}
}
