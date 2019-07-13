package home.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class OddEvenLock extends ReentrantLock {

	private static final long serialVersionUID = 1L;

	public volatile boolean isPrime;

}
