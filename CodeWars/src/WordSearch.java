import java.util.ArrayList;
import java.util.Arrays;


class WordSearch {
	private static String secret = "notVeryWellProtected";
  static String[] findWord(String x, String[] y){
	  ArrayList<String> wynik=new ArrayList<>();
	  int j=0;
	  for(int i=0;i<y.length;i++)
		  if(y[i].toUpperCase().contains(x.toUpperCase())) {
			  wynik.add(y[i]);
	  		}
	  String[] results={"Empty"};
	  if(!wynik.isEmpty()){
	  results=new String[wynik.size()];
	  results=wynik.toArray(new String[0]);
	  }
	  return results;
	  
  }

	public static void main(String[] args) {
		WordSearch test;
		String[] test1 = {"lemonade", "limeade", "Yoo-Hoo", "root beer", "grapeade ", "water", "Mr. Pibb"};
		System.out.println(Arrays.toString(WordSearch.findWord("ade",test1)));

	}

}
