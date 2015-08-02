package zadanie2;

import java.util.Arrays;

public class GiftSorter{
	  public String sortGiftCode(String code){
	    char[] znaki=code.toCharArray();
	    Arrays.sort(znaki);
	    return new String(znaki);
	  }
  public static void main(String[] args) {
	  GiftSorter gs = new GiftSorter();
      System.out.println(gs.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
		
	}

};