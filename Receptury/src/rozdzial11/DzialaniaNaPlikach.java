package rozdzial11;

import java.io.File;
import java.io.IOException;

public class DzialaniaNaPlikach {

	public static void main(String[] args) throws IOException {
		File f=new File("aaa.txt");
		f.createNewFile();
		f.renameTo(new File("bbb.txt"));
		File bkup=new File("DzialaniaNaPlikach.java~");
		bkup.delete();
		
		File tmp=File.createTempFile("sadas", "ccc");
		tmp.deleteOnExit();
		
		
		

	}

}
