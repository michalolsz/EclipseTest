
public class CaffeineBuzz {
	 public static String caffeineBuzz(int n){
	      String wynik="";
	      if(n%3==0 && n%4==0) wynik+="Coffee";
	      else if(n%3==0) wynik+="Java";
	      else if(n%2!=0)wynik+="mocha_missing!";
	      if(n%2==0) wynik+="Script";
	    return wynik;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
