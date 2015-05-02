package rozdzial10;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinarnePliki {

	public static void main(String[] args) throws IOException {
		double d=Math.PI;
		DataOutputStream os=new DataOutputStream(new FileOutputStream("binary.dat"));
		os.writeInt(42);
		os.writeDouble(d);
		os.close();
		System.out.println("Zapisano");

	}

}
