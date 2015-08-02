import java.util.Arrays;
import java.util.List;


public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    List list = Arrays.asList(new Character[] {'a','e','i','o','u'});
    for(int i=0;i<str.length();i++){
    	if(list.contains(str.charAt(i))) vowelsCount++;
    } 
        
    return vowelsCount;
  }
  public static void main(String[] args) {
		
		System.out.println(Vowels.getCount("abracadabra"));

	}

}
