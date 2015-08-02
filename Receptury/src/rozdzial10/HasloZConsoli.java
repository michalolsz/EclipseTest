package rozdzial10;

import java.io.Console;

public class HasloZConsoli {

	public static void main(String[] args) {
		Console cons = System.console();
		char[] passwd=null;
		passwd=cons.readPassword("Podaj haslo: ");
		System.out.println("Wpisales haslo: "+new String(passwd));

	}

}
