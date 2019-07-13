package home.concurrency;

public class PrintOddEven implements Runnable {
	
	private boolean isPrime;
	private int range;
	private OddPrimeMonitor lock;

	public PrintOddEven(boolean isPrime,int range,OddPrimeMonitor lock) {
		super();
		this.isPrime = isPrime;
		this.range = range;
		this.lock = lock;
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
		for(int i=2;i<range;i+=2) {
			synchronized (lock) {
				while(!lock.isPrime) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				print(i,"Even");
				lock.isPrime=false;
				lock.notifyAll();
			}
			
		}
	}
	
	private void printOdd() {
		for(int i=1;i<range;i+=2) {
			synchronized (lock) {
				while(lock.isPrime) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				print(i,"Odd");
				lock.isPrime=true;
				lock.notifyAll();
			}
		}
	}
	
	private void print(int i,String s) {
			System.out.println(s+" :" +i);
	}

}
