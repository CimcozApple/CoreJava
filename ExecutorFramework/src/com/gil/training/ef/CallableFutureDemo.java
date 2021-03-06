package com.gil.training.ef;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(String[] args) {
		MyCallable[] callables = {new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40), new MyCallable(50), new MyCallable(60)};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for (MyCallable myCallable : callables) {
			Future<Integer> future = service.submit(myCallable);
			try {
				System.out.println("Result: "+future.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		service.shutdown();
	}
	
	
	/*
	 * Executor framework will create a pool of threads
	 *  
	 * The service maethod takes a callable and returns a future
	 * 
	 * Exceptions thrown when we invoke future.get().. Interrupted and ServiceException
	 * 
	 * ExecutorService method that should be called at the end : shutdown()
	 */

}
