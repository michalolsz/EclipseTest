package rozdzial10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OdczytwanieZawartosciPlikuToString {

	public static void main(String[] args) {
		try {
			String input=new String(Files.readAllBytes(Paths.get("test.txt")));
			System.out.println(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
