package rozdzial11;

import java.io.File;

public class KatalogiGlowne {

	public static void main(String[] args) {
		File[] pliki=File.listRoots();
		for(File plik:pliki)
			System.out.println(plik);

	}

}
