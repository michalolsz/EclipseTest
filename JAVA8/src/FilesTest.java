import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FilesTest {

	public static void main(String[] args) throws IOException {
		try (Stream<Path> stream = Files.list(Paths.get(""))) {
			String joined = stream.map(String::valueOf).filter(path -> !path.startsWith(".")).sorted().collect(Collectors.joining("; "));
		    System.out.println("List: " + joined);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Path start = Paths.get("");
		int maxDepth = 5;
		try (Stream<Path> stream = Files.walk(start, maxDepth)) {
		    String joined = stream
		        .map(String::valueOf)
		        .filter(path -> path.endsWith(".txt"))
		        .sorted()
		        .collect(Collectors.joining("; "));
		    System.out.println("walk(): " + joined);
		}
		
		List<String> lines = Files.readAllLines(Paths.get("test.txt"));
		lines.add("print('foobar');");
		Files.write(Paths.get("test2.txt"), lines);

	}
	
	

}
