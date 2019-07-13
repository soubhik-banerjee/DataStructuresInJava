package home.concurrency;

import java.util.concurrent.locks.Condition;

public class PrintOddEvenWithSemaphoreMain {

	public static void main(String[] args) {
		OddEvenLock lock = new OddEvenLock();
		Condition waitCondition = lock.newCondition();
		
		Thread primePrinter = new Thread(new PrintOddEvenWithSemaphore(true,100, lock,waitCondition));
		Thread oddPrinter = new Thread(new PrintOddEvenWithSemaphore(false,100, lock,waitCondition));
		
		oddPrinter.start();
		primePrinter.start();

	}

}
