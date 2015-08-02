
public class DuplicateEncoder {
	static String encode(String word){
		String wynik="";
		String tmp=word.toLowerCase();
		for(int i=0;i<word.length();i++)
			if(tmp.indexOf(tmp.charAt(i))!=tmp.lastIndexOf(tmp.charAt(i)))
				wynik+=")";
			else wynik+="(";
    return wynik;
  }

	public static void main(String[] args) {
		DuplicateEncoder test=new DuplicateEncoder();
		System.out.println(test.encode("din"));

	}

}
