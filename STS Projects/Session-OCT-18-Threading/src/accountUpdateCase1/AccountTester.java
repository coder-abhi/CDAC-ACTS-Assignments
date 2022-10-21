package accountUpdateCase1;

public class AccountTester {

	public static void main(String[] args) {
		Account ac1 = new Account(1000)	;
		
		Thread t1 = new Thread(new DepositFun(ac1, 2500));
		Thread t2 = new Thread(new WithdrowFun(ac1, 5000));
		Thread t3 = new Thread(new DepositFun(ac1, 2500));
		Thread t4 = new Thread(new DepositFun(ac1, 2500));
		
		Thread t9 = new Thread(new BalanceCheckFun(ac1));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t9.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t9.join();
		} catch (InterruptedException e) {
		}
		
		System.out.println("Final Balance  : "+ac1.checkBalance());
			
	}

}
