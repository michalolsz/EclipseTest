package rozdzial3;

public class Builder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("Witaj");
		sb.append(',');
		sb.append(' ');
		sb.append("swiecie");
		System.out.println(sb);
		
		System.out.println(new StringBuilder().append("Witaj").append(',').append(' ').append("swiecie"));
		
		String a="abcde";
		StringBuilder b=new StringBuilder(a).reverse();
		System.out.println(b);

	}

}
