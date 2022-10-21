package oddEvenCase1;

public class OddEvenCase1Tester {

	public static void main(String[] args) {
		OddEvenPrinter pr1 = new OddEvenPrinter("Even Printer", 100, true);
		OddEvenPrinter pr2 = new OddEvenPrinter("Odd  Printer", 100, false);
		
		pr1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pr2.start();
		
		
	}

}
