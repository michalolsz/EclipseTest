package rozdzial11;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class InformacjeOPliku {

	public static void main(String[] args) throws IOException {
		File f=new File("test.txt");
		if(!f.exists()) System.out.println("Nie znaleziono pliku");
		else{
			System.out.println("Nazwa kanoniczna "+f.getCanonicalPath());
			String p=f.getParent();
			if(p!=null) System.out.println("Katalog nadrzedny: "+p);
			if(f.canRead()) System.out.println("Zawartosc pliku mozna odczytac");
			if(f.canWrite()) System.out.println("W pliku mozna zapisywac");
			Date d=new Date(f.lastModified());
			System.out.println("Data ostatniej modyfikacji "+d);
			if(f.isFile()){
				System.out.println("Plik ma wielkosc "+f.length()+" bajtow");
			}else if(f.isDirectory()) System.out.println("to katalog");
			
		}

	}

}
