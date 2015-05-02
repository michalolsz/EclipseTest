import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamTest {

	public static void main(String[] args) {
		List<String> myList =Arrays.asList("a1", "a2", "b1", "c2", "c1");
		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
		
		Stream.of("a1", "a2", "a3").findFirst().ifPresent(System.out::println); 
		
		Arrays.stream(new int[] {1, 2, 3}).map(n -> 2 * n + 1).average().ifPresent(System.out::println); 
		Arrays.stream(new int[] {1, 2, 3}).map(n -> 2 * n + 1).forEach(System.out::println); 
		
		Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);  // 3
		
		System.out.println();
		Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> 
			{
	        System.out.println("filter: " + s);
	        return true;
	    	}).forEach(s -> System.out.println("forEach: " + s));
		
		Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    }).map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    }) .forEach(s -> System.out.println("forEach: " + s));
		
		
		Stream.of("d2", "a2", "b1", "b3", "c").sorted((s1, s2) -> {
	        System.out.printf("sort: %s; %s\n", s1, s2);
	        return s1.compareTo(s2);
	    }).filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    }).map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    }).forEach(s -> System.out.println("forEach: " + s));
		
		
	}

}
