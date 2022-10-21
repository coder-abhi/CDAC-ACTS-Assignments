package accountUpdateCase1;

public class BalanceCheckFun implements Runnable {
	Account account;
	public BalanceCheckFun(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		System.out.println("Your Account Balance is : "+this.account.checkBalance());	
	}
}
