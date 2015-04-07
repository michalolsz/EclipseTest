package rozdzial4;

import java.util.regex.Pattern;

public class WystepowanieWzorca {

	public static void main(String[] args) {
		String pattern="^K[^w]\\d+\\.";
		String[] input={
				"KA777. Jestescie o czasie. Mozecie ladowac.",
				"Kwa, kwa, kwa!"
		};
		Pattern p=Pattern.compile(pattern);
		for(String in:input){
			boolean found=p.matcher(in).lookingAt();
			System.out.println("'"+pattern+"'"+(found ? "pasuje ":"nie pasuje ")+in);
		}
		
		String pattern2=".*Q[^u]\\d+\\..*";
		String linia="Zamow QT4. Juz dzis!";
		if(linia.matches(pattern2)) System.out.println("Pasuje");
		else System.out.println("Nie pasuje");

	}

}
