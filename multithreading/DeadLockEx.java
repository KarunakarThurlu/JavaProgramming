package multithreading;

import java.time.Duration;

public class DeadLockEx {
	private static final Object accountLock = new Object();
	private static final Object stmtLock = new Object();
	
	public static void main(String[] args) {
		Thread paymentThread = new Thread(() -> {
			synchronized (accountLock) {
				System.out.println("PaymentThread locked transaction ");
				sleep(2);
				synchronized (stmtLock) {
					System.out.println("PaymentThread locked report ");
				}
			}
		});

		Thread reportThread = new Thread(() -> {
			synchronized (accountLock) {
				System.out.println("ReportThread locked statement ");
				sleep(2);
				synchronized (stmtLock) {
					System.out.println("ReportThread locked transaction ");
				}
			}
		});
		reportThread.start();
		paymentThread.start();

	}

	private static void sleep(int n) {
		try {
			Thread.sleep(Duration.ofSeconds(n));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
