package oddEvenCase2;

public class OddEvenCase2Tester {

	public static void main(String[] args) {
		SharedPrinter printer = new SharedPrinter();
		OddEvenPrinter pr1 = new OddEvenPrinter(printer, 100, true);
		OddEvenPrinter pr2 = new OddEvenPrinter(printer, 100, false);
		
		pr1.start();
		pr2.start();
		
	}

}
