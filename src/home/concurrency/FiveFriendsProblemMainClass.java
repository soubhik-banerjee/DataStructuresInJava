package home.concurrency;

/**
 * There are five friends. They are going form Mumbai to Goa. They start from Mumbai on their own but should meet at Pune before 
 * Moving towards Goa. All should wait till everyone joins at Pune and then should start again. 
 * 
 */

public class FiveFriendsProblemMainClass {

	public static void main(String[] args) throws InterruptedException {
		MumbaiStartMonitor mumbaiWait = new MumbaiStartMonitor();
		PuneMonitor puneWait = new PuneMonitor();
		
		Thread f1 = new Thread(new Friend(mumbaiWait, puneWait));
		Thread f2 = new Thread(new Friend(mumbaiWait, puneWait));
		Thread f3 = new Thread(new Friend(mumbaiWait, puneWait));
		Thread f4 = new Thread(new Friend(mumbaiWait, puneWait));
		Thread f5 = new Thread(new Friend(mumbaiWait, puneWait));
		
		System.out.println("All friends starting....");
		f1.start();
		f2.start();
		f3.start();
		f4.start();
		f5.start();
		
		f1.join();
		f2.join();
		f3.join();
		f4.join();
		f5.join();
		
		System.out.println("All friends proceeding....");
	}

}
