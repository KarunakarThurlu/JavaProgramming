package multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureEx {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//user service Rest call
			String s="User Details";
			System.out.println("Running Aynchronusly......");
			System.out.println(Thread.currentThread().getName());
			return s.toLowerCase();
		}).exceptionally((e)->"Default user");
		
		CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//Order service Rest call
			String s="Order Details";
			System.out.println("Running Aynchronusly......");
			System.out.println(Thread.currentThread().getName());
			return s.toLowerCase();
		}).exceptionally((e)->"Default ......");
		
		CompletableFuture<String> thenCombine = cf1.thenCombine(cf2, (r1,r2)->r1+" | "+r2);
		
		String string = thenCombine.get();
		
		System.out.println(string);
		System.out.println(Thread.currentThread().getName());
	}
}
