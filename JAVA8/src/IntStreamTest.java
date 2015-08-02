import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class IntStreamTest {

	public static void main(String[] args) {
		int sum = IntStream.builder().add(10).add(10).build().sum();
		System.out.println(sum);
		
		IntStream first=IntStream.builder().add(10).add(10).build();
		IntStream second = IntStream.builder().add(10).build();
	    IntStream third = IntStream.concat(first, second);
		System.out.println(third.sum());
		
		IntStream emptyStream = IntStream.empty();
		
		OptionalInt one = IntStream.generate(() -> 1).limit(10).distinct().findFirst();
		System.out.println(one.getAsInt());
		
		List<Integer> numbers = IntStream.iterate(0, n -> n + 3).limit(3) .boxed().collect(Collectors.toList());
		numbers.forEach(System.out::println);
		
		List<Integer> numbers2 = IntStream.range(1, 4).boxed().collect(Collectors.toList());
		numbers2.forEach(System.out::println);
		
		List<String> integers = new ArrayList<String>();
	    integers.add("1");
	    integers.add("2");
	    integers.add("3");

	    OptionalInt intStream = integers.parallelStream().mapToInt(Integer::parseInt).filter(e->e%2==0).max();
	    System.out.println(intStream.getAsInt());
	    
	    int[] number = { 1, 2, 3, 4, 5, 6 };
	    List<Integer> listOfInteger = Arrays.stream(number).boxed().collect(Collectors.toList());
	    
	    List<String> integers2 = new ArrayList<String>();
	    int optionalInt = integers2.stream().mapToInt(Integer::parseInt).max().orElse(5);
	    System.out.println();
	    
	    IntStream.range(0, 10).forEach(
	    		nbr -> System.out.println(nbr)
	    	);
	    System.out.println();
	    
	    IntStream.range(0, 10).parallel().forEach(
	    		nbr -> {
	    		try {
	    			Thread.sleep(1000);
	    			} catch (InterruptedException ex) {}
	    	        	System.out.println(nbr);
	    	        }
	    	);

		
		
	}

}
