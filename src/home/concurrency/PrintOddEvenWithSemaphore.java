package home.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class PrintOddEvenWithSemaphore implements Runnable {

	private boolean isPrime;
	private int range;
	OddEvenLock lock;
	Condition waitCondition;

	public PrintOddEvenWithSemaphore(boolean isPrime, int range, OddEvenLock lock,Condition waitCondition) {
		super();
		this.isPrime = isPrime;
		this.range = range;
		this.lock = lock;
		this.waitCondition = waitCondition;
	}

	@Override
	public void run() {
		if(isPrime) {
			printPrime();
		}
		else {
			printOdd();
		}
	}

	private void printPrime() {
		for(int i=2;i<=range;i+=2) {
			try {
				lock.lock();
				if(!lock.isPrime) {
					waitCondition.await();
				}
				print(i,"Even");
				lock.isPrime = false;
				waitCondition.signal();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
			}
		}
	}

	private void printOdd() {
		for(int i=1;i<=range;i+=2) {
			try {
				lock.lock();
				if(lock.isPrime) {
					waitCondition.await();
				}
				print(i,"Odd");
				lock.isPrime = true;
				waitCondition.signal();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.unlock();
			}
		}
	}

	private void print(int i,String s) {
		System.out.println(s+" :" +i);
	}

}
