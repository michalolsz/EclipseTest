import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;


public class WhichAreIn {
	public static String[] inArray2(String[] array1, String[] array2) {
		List<String> list=new ArrayList<>();
		Arrays.sort(array1);
		for(String word:array1){
			for(String word2:array2){
				if(word2.contains(word)) {
					list.add(word);
					break;
				}	
			}
		}
		 return (String[]) new LinkedHashSet<String>(list).toArray(new String[0]);
		 //return list.toArray(new String[0]);
	}
	public static String[] inArray(String[] array1, String[] array2) {
		return Arrays.stream(array1).filter(s1 -> Arrays.stream(array2).anyMatch(s2 -> s2.contains(s1))).distinct().sorted().toArray(String[]::new);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
