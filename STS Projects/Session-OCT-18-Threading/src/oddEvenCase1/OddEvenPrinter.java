package oddEvenCase1;

public class OddEvenPrinter extends Thread{
	Integer limit;
	Boolean isEven;
	public OddEvenPrinter(String messege, Integer limit, Boolean isEven) {
		super(messege);
		this.limit = limit;
		this.isEven = isEven;
	}
	@Override
	public void run() {
		int start = isEven == true ? 0 : 1;
		while(start <= limit) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + " : "+start);
			start += 2;
		}
	}
}
