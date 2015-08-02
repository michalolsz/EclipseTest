import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class StreamTest2 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList( 
				new Person("Max", 18),
			    new Person("Peter", 23),
			    new Person("Pamela", 23),
			    new Person("David", 12));
		
		List<Person> filtered =persons.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toList());
		System.out.println(filtered);
		
		Map<Integer, List<Person>> personsByAge =persons.stream().collect(Collectors.groupingBy(p -> p.age));
		personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
		
		IntSummaryStatistics ageSummary =persons.stream().collect(Collectors.summarizingInt(p -> p.age));
		System.out.println(ageSummary);
		
		String phrase = persons.stream() .filter(p -> p.age >= 18).map(p -> p.name).collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));
		System.out.println(phrase);
		
		persons.parallelStream().reduce((p1, p2) -> p1.age > p2.age ? p1 : p2).ifPresent(System.out::println);
		
		Integer ageSum = persons .parallelStream()
				.reduce(0, (sum, p) -> {
			            System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
			            return sum += p.age;
			        },(sum1, sum2) -> {
			            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
			            return sum1 + sum2;
			        });
		System.out.println(ageSum);
	}

}
