import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SearchEngine {
    static int find(String needle, String haystack){
    	if(needle.length()>haystack.length()) return 0;	
    	//needle=needle.replaceAll("\\$", Matcher.quoteReplacement("\\$"));
    	//needle=needle.replaceAll("_",".");
    	needle=needle.replace(".", "\\.").replace("$", "\\$").replace("_", ".");
    	System.out.println(needle);
    	Pattern p=Pattern.compile(needle);
    	Matcher m=p.matcher(haystack);
    	if(m.find()) return m.start(); 	
    	return -1; 
    }


	public static void main(String[] args) {
		System.out.println(find("a$b", "a$bb"));
	}

}
