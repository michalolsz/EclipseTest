package rozdzial3;

import java.util.StringTokenizer;

public class Tokenizer {
	
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Witaj, œwiecie Javy");
		while(st.hasMoreTokens())
			System.out.println("Leksem: "+st.nextToken());
		System.out.println();
		StringTokenizer st2=new StringTokenizer("Witaj, œwiecie|Javy", ", |");
		while(st2.hasMoreTokens())
			System.out.println("Leksem: "+st2.nextToken());
		System.out.println();
		StringTokenizer st3=new StringTokenizer("Witaj, œwiecie|Javy", ", |",true);
		while(st3.hasMoreTokens())
			System.out.println("Leksem: "+st3.nextToken());
	}

}
