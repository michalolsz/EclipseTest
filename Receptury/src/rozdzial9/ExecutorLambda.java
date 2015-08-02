package rozdzial9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ExecutorLambda {
	int count = 0;

	void increment() {
	    count = count + 1;
	}
	synchronized void incrementSync() {
	    count = count + 1;
	}
	
	void stop(ExecutorService executor){
		try {
		    System.out.println("attempt to shutdown executor");
		    executor.shutdown();
		    executor.awaitTermination(5, TimeUnit.SECONDS);
		}
		catch (InterruptedException e) {
		    System.err.println("tasks interrupted");
		}
		finally {
		    if (!executor.isTerminated()) {
		        System.err.println("cancel non-finished tasks");
		    }
		    executor.shutdownNow();
		    System.out.println("shutdown finished");
		}
	}
	void zad0(){
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		});
	}
	void zad1(){
		ExecutorService executor = Executors.newFixedThreadPool(3);
		IntStream.range(0, 10000).forEach(i -> executor.submit(this::increment));
		stop(executor);
		System.out.println(count); 
	}
	void zad2(){
		ExecutorService executor = Executors.newFixedThreadPool(3);
		IntStream.range(0, 10000).forEach(i -> executor.submit(this::incrementSync));
		stop(executor);
		System.out.println(count);
	}
	

	public static void main(String[] args) {
		ExecutorLambda test=new ExecutorLambda();
		test.zad2();

	}

}
