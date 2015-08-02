
public class SpinWords {

  public String spinWords(String sentence) {
    String[] words=sentence.split(" ");
    StringBuilder result=new StringBuilder();
    for(String word:words){
    	if(word.length()>4) result.append(new StringBuilder(word).reverse()+" ");
    	else result.append(word+" ");
    	
    }
    return new String(result).trim();
  }


	public static void main(String[] args) {
		System.out.println(new SpinWords().spinWords("Welcome"));

	}

}
