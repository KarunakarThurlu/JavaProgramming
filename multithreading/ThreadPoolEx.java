package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx {
	
	public static void main(String[] args) {
		ExecutorService es= Executors.newFixedThreadPool(7);
		for(int i=0;i<10;i++) {
			Runnable r= new MyTask(i);
			es.submit(r);
		}
		es.shutdown();
	}
}

class MyTask implements Runnable{

	private int taskId;
	
	
	public MyTask() {
		super();
	}

	public MyTask(int taskId) {
		super();
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println("Current Task with Id "+taskId+" "+Thread.currentThread().getName());
	}
	
}
