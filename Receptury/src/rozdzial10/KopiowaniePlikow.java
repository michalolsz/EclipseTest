package rozdzial10;

import java.io.File;
import java.io.IOException;

import javax.imageio.stream.FileImageOutputStream;

public class KopiowaniePlikow {

	public static void main(String[] args) throws IOException {
		FileIO.copyFile("test.txt","kopia.txt");

	}

}
