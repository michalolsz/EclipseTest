package rozdzial5;

public class TempConverter {

	public static void main(String[] args) {
		for(int i=-40;i<=120;i+=10){
			float c=(i-32)*(5f/9);
			System.out.printf("%6d %6.2f%n",i,c);
		}

	}

}
