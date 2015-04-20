package rozdzial5;

public class FormatLMnoga {
	public static void plural(int n){
		int t=n<20 ? n: n %10;
		if(n==1) System.out.println("Zuzyto "+n+" element");
		else System.out.println("Zyzyto "+n+" element"+((t<=1 || t>=5)?"ow":"y"));
	}

	public static void main(String[] args) {
		plural(3);
		plural(6);

	}

}
