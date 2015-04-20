package rozdzial5;

public class InfNan {

	public static void main(String[] args) {
		double d=123;
		double e=0;
		if(d/e==Double.POSITIVE_INFINITY) System.out.println("Positive Infinity");
		double s=Math.sqrt(-1);
		if(s==Double.NaN) System.out.println("W taki sposob zwroci false");
		if(Double.isNaN(s)) System.out.println("W taki sposob zwroci true");

	}

}
