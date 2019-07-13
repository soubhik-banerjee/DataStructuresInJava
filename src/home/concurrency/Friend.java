package home.concurrency;

public class Friend implements Runnable {
	
	MumbaiStartMonitor mumbaiMonitor;
	PuneMonitor puneMonitor;

	@Override
	public void run() {
		
		synchronized (mumbaiMonitor) {
			mumbaiMonitor.waitAtMumbaiCount++;
			if(mumbaiMonitor.waitAtMumbaiCount==5) {
				mumbaiMonitor.notifyAll();
			}
			while(mumbaiMonitor.waitAtMumbaiCount<5) {
				try {
					mumbaiMonitor.waitAtMumbaiCount++;
					System.out.println(Thread.currentThread().getName()+" waiting at Mumbai to start");
					mumbaiMonitor.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		try {
			proceedTowardsPune();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void proceedTowardsPune() throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" proceeding towards Pune");
		Thread.sleep(600);
		System.out.println(Thread.currentThread().getName()+" reached Pune");
		synchronized (puneMonitor) {
			puneMonitor.puneWait++;
			if(puneMonitor.puneWait==5) {
				puneMonitor.notifyAll();
			}
		   while(puneMonitor.puneWait<5) {
			   puneMonitor.wait();
		   }
		}
		System.out.println(Thread.currentThread().getName()+" proceeding towards Goa");
	}

	public Friend(MumbaiStartMonitor mumbaiMonitor, PuneMonitor puneMonitor) {
		super();
		this.mumbaiMonitor = mumbaiMonitor;
		this.puneMonitor = puneMonitor;
	}

}
