package rozdzial5;

public class NumberPalindrom {
	long findPalindrom(long n){
		if(isPalindrom(n)) return n;
		else return findPalindrom(n+reverseNumber(n));
	}
	long reverseNumber(long n){
		StringBuilder wyraz=new StringBuilder(n+"").reverse();
		return Long.parseLong(new String(wyraz));
		
	}
	boolean isPalindrom(long n){
		StringBuilder wyraz=new StringBuilder(n+"");
		StringBuilder wyrazodwrocony=new StringBuilder(wyraz).reverse();
		if(wyraz.toString().equals(wyrazodwrocony.toString())) return true;
		else return false;
	}
	
	
	public static void main(String[] args) {
		NumberPalindrom test=new NumberPalindrom();
		System.out.println(test.findPalindrom(72));
		System.out.println(test.findPalindrom(142));
		System.out.println(test.findPalindrom(3542));
		System.out.println(test.findPalindrom(17892));

	}

}
