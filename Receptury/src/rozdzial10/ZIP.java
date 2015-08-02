package rozdzial10;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class ZIP {

	public static void main(String[] args) throws ZipException, IOException {
		ZipFile zippy=new ZipFile(new File("test.zip"));
		Enumeration all=zippy.entries();
		while(all.hasMoreElements()){
			ZipEntry entry=(ZipEntry)all.nextElement();
			if(entry.isDirectory()) System.out.println("Katalog: "+entry.getName());
			else System.out.println("Plik: "+entry.getName());
		}
		

	}

}
