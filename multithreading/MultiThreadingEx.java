package multithreading;

public class MultiThreadingEx {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			for (int i = 1; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();

		// Task2
		for (int i = 700; i <= 900; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

}
