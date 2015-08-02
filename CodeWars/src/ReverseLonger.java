
public class ReverseLonger {


	public static String shorterReverseLonger(String a, String b) {
	    if(a.length()==b.length()) return b+new StringBuilder(a).reverse()+b;
	    else if(a.length()>b.length()) return b+new StringBuilder(a).reverse()+b;
	    else return a+new StringBuilder(b).reverse()+a;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
