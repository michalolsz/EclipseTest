import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StringTest {

	public static void main(String[] args) {
		System.out.println(String.join(":", "foobar", "foo", "bar"));
		
		System.out.println("foobar:foo:bar".chars().distinct().mapToObj(c -> String.valueOf((char)c)).sorted().collect(Collectors.joining()));
	
		System.out.println(Pattern.compile(":").splitAsStream("foobar:foo:bar").filter(s -> s.contains("bar")).sorted().collect(Collectors.joining(":")));
	
		Pattern pattern = Pattern.compile(".*@gmail\\.com");
		
		System.out.println(Stream.of("bob@gmail.com", "alice@hotmail.com").filter(pattern.asPredicate()).count());
	}

}
