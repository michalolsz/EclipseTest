package rozdzial9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc"," ","bcd","" ,"defg","jk");	
		List<String> filtered = strList.parallelStream().filter(x -> x.length()> 2).collect(Collectors.toList()); 
		System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
		
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", ")); 
		System.out.println(G7Countries); 

	

	

	}

}
