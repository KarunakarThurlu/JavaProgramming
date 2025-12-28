package multithreading;

import java.time.Duration;

public class WaitAndNotifyExample {

	private final Object lock = new Object();
	private boolean num = true;
	Runnable numbersPrintLogic = () -> {
		for (int i = 1; i <= 10; i++) {
			synchronized (lock) {
				while (!num) {
					try {
						lock.wait();
						Thread.sleep(Duration.ofSeconds(1));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				num = false;
				
				lock.notify();
			}
		}
	};

	Runnable charactersPrintLogic = () -> {
		for (char i = 'A'; i <= 'I'; i++) {
			synchronized (lock) {
				while (num) {
					try {
						lock.wait();
						Thread.sleep(Duration.ofSeconds(1));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				num = true;
				lock.notify();

			}
		}
	};

	public void startThreds() {
		Thread numbersPrintThread = new Thread(numbersPrintLogic);
		Thread charactersPrintThread = new Thread(charactersPrintLogic);
		numbersPrintThread.start();
		charactersPrintThread.start();
	}

	public static void main(String[] args) {
		WaitAndNotifyExample waitAndNotifyExample = new WaitAndNotifyExample();
		waitAndNotifyExample.startThreds();
	}
}
