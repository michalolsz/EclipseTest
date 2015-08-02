package rozdzial10;

public class FormatterPrintf {

	public static void main(String[] args) {
		//0 w razie potrzeby wype³nic znakami 0, 4 lugosc pola, d calkowita, f zmiennoprzecinkowa %n nowa linia
		System.out.printf("%-4d - jest rokiem %2$f%n",1956,Math.PI);
		
		System.out.printf("Przyblizaona wartosc pi wynosi %4.2f%n",Math.PI);
		

	}

}
