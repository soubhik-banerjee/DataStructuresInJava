package home.concurrency;

public class PrintOddEvenMain {

	public static void main(String[] args) {
		OddPrimeMonitor lock = new OddPrimeMonitor();
		Thread primePrinter = new Thread(new PrintOddEven(true,100, lock));
		Thread oddPrinter = new Thread(new PrintOddEven(false,100, lock));
		
		oddPrinter.start();
		primePrinter.start();
	}

}
