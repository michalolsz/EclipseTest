package rozdzial10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardoweWejscie {

	public static void main(String[] args) {
		try {
			int b=System.in.read();
			System.out.println(b);
			BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
			String linia=is.readLine();
			System.out.println(linia);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
