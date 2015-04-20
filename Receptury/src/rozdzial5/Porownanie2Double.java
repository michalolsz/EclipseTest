package rozdzial5;

public class Porownanie2Double {
	public static boolean equals(double a,double b){
		if(a==b) return true;
		return Math.abs(a-b)<1.0E-15;
	}


	public static void main(String[] args) {
		System.out.println(equals(1.01000000000, 1.01));

	}

}
