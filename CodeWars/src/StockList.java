import java.util.Arrays;
import java.util.StringTokenizer;


public class StockList { 
	
  // 1st parameter is the stocklist (L in example), 
	// 2nd parameter is list of categories (M in example)
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		if((lstOfArt.length==0) || (lstOf1stLetter.length==0)) return "";
		int tab[]=new int[lstOf1stLetter.length];
		for(String slowo:lstOfArt){
			StringTokenizer token=new StringTokenizer(slowo);
			String test=token.nextToken();
			Integer ile=Integer.parseInt(token.nextToken());
			for(int i=0;i<lstOf1stLetter.length;i++)
				if(lstOf1stLetter[i].contains(test.substring(0, 1))) tab[i]+=ile;
		}
		String result="";
		for(int i=0;i<lstOf1stLetter.length-1;i++)
			result+="("+lstOf1stLetter[i]+" : "+tab[i]+") - ";
		return result+="("+lstOf1stLetter[lstOf1stLetter.length-1]+" : "+tab[lstOf1stLetter.length-1]+")";
	}


	public static void main(String[] args) {
		StockList test=new StockList();
		String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
		String cd[] = new String[] {"A", "B"};
		System.out.println(stockSummary(art, cd));

	}

}
