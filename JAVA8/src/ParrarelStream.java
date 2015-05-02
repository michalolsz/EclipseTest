import java.util.concurrent.ForkJoinPool;


public class ParrarelStream {

	public static void main(String[] args) {
		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		System.out.println(commonPool.getParallelism());

	}

}
