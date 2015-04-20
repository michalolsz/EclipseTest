package rozdzial5;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RomanFormat {
	public  String getRoman(int number) {
	    String roman[] = {"M","XM","CM","D","XD","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    StringBuilder result = new StringBuilder();
	    int i = 0;
	    while (number > 0 || arab.length == (i - 1)) {
	        while ((number - arab[i]) >= 0) {
	            number -= arab[i];
	            result.append(roman[i]);
	        }
	        i++;
	    }
	    return result.toString();
	}

	public static void main(String[] args) {
		RomanFormat test=new RomanFormat();
		System.out.println(test.getRoman(1023));

	}

}
