package home.concurrency;

public class MyBlockingQueueMain {

	public static void main(String[] args) {
		MyBlockingQueue queue = new MyBlockingQueue(30);
		Thread producer = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<50;i++) {
					try {
						System.out.println("------Adding to the queue messsage with id : "+i);
						queue.put(i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
		Thread consumer = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						System.out.println("------Removing from queue message with id : "+queue.take());
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
		consumer.start();
		producer.start();
	}
}
