package oddEvenCase2;

public class SharedPrinter {
	private boolean isEven = false;
	public synchronized void PrintEven(int num) throws InterruptedException {
		while(!isEven) {
			wait();
		}
		System.out.println("Even : "+num);
		isEven = false;
		notify();
	}
	public synchronized void PrintOdd(int num) throws InterruptedException {
		while(isEven) {
			wait();
		}
		System.out.println("Odd  : "+num);
		isEven = true;
		notify();
	}
}
