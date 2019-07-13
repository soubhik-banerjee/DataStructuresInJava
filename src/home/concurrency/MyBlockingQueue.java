package home.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class MyBlockingQueue {

	private Queue<Object> blockingQueue = new LinkedList<>();
	private int entries = 0;

	public MyBlockingQueue(int entries) {
		super();
		this.entries = entries;
	}

	public synchronized void put(Object data) throws InterruptedException {
		if(blockingQueue.size()==entries) {
			wait();
		}
		if(blockingQueue.size()==0) {
			notifyAll();
		}
		blockingQueue.offer(data);
	}
	
	public synchronized Object take() throws InterruptedException {
		if(blockingQueue.size()==0) {
			wait();
		}
		if(blockingQueue.size()==entries) {
			notifyAll();
		}
		return blockingQueue.poll();
	}

}
