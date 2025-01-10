package multithreading;

public class ThreadPriorityEx {
	
	public static void main(String[] args) {
		
		Runnable r= ()->System.out.println(Thread.currentThread().getName());
		
		Thread t=new Thread(r);
		t.setName("child");
		t.setPriority(2);
		System.out.println("Child Thread Priority :"+t.getPriority());
		t.start();
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
	}
}
