package oddEvenCase2;

public class OddEvenPrinter extends Thread{
	Integer limit;
	Boolean isEven;
	SharedPrinter printer;
	public OddEvenPrinter(SharedPrinter printer, Integer limit, Boolean isEven) {
		this.printer = printer;
		this.limit = limit;
		this.isEven = isEven;
	}
	@Override
	public void run() {
		int start = isEven == true ? 2 : 1;
		try {
		while(start <= limit) {

				if(isEven) {
					printer.PrintEven(start);
				}
				else printer.PrintOdd(start);
				start += 2;
		}
		} catch (Exception e) {
		}
	}
}