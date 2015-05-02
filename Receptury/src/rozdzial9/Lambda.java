package rozdzial9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class Lambda {
	private static IntFunction<Integer> 
	fib=n->n==0?0:n==1?1:n;
	
	Function<Integer, Integer> podwojenieLiczby = (Integer ob) -> {
        return ob * 2;
    };
    public static void funkcja(Function f, Object o) {
        System.out.println(f.apply(o));
    }


	public static void main(String[] args) {
		new Thread(
			    () -> System.out.println("Hello z w¹tku")
			).start();
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(n -> System.out.println(n));
		int sum=list.parallelStream().map(x->x*x).reduce((x,y)->x+y).get();
		System.out.println(sum);
		System.out.println(fib.apply(1));
		Lambda test=new Lambda();
		funkcja(test.podwojenieLiczby, 2);
		
		list.forEach(System.out::println);


	}

}
