package accountUpdateCase1;

public class WithdrowFun implements Runnable {
	Account account;
	int amount;
	public WithdrowFun(Account account,int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		account.Withdrow(amount);
	}
}
