package rozdzial4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZastepowanieOkreslonegoTekstu {
	public static void main(String[] args) {
		String patt="\\bprac\\b";
		String input="Plan prac zmusza pracownikow do duzego wysilku.";
		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(input);
		System.out.println(m.replaceAll("samoksztalcenia"));
	}

}
