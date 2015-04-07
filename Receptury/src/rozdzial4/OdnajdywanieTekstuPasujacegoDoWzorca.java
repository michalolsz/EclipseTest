package rozdzial4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OdnajdywanieTekstuPasujacegoDoWzorca {

	public static void main(String[] args) {
		String pattern="Q[^u]\\d+\\.";
		String linia="Zamow QT4. Juz dzis!";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(linia);
		if(m.find())
			System.out.println(m.group(0));
		else System.out.println("Nie pasuje");
		
		Matcher m2=p.matcher(linia);
		if(m2.find())
			System.out.println(linia.substring(m2.start(0),m2.end(0)));
		else System.out.println("Nie pasuje");
		
		String inputLine="Adamski, Andrzej Alojzy";
		Pattern r=Pattern.compile("(.*), (.*)");
		Matcher m3=r.matcher(inputLine);
		if(m3.matches()){
			System.out.println(m3.group(2)+" "+m3.group(1));
		}
	}

}
