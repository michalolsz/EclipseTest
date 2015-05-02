import java.util.Arrays;


public class TablicaSortujacaDomyslna extends TablicaSortujaca {
	public TablicaSortujacaDomyslna(){
		super();
	}
	public TablicaSortujacaDomyslna(int... args){
		super(args);
	}
	@Override
	public void sortuj() {
		Arrays.sort(dane);
	}

	
	public static void main(String[] args) {
		TablicaSortujaca test=new TablicaSortujacaDomyslna(1,2,3,6,1,4);
		System.out.println(test);
		test.sortuj();
		System.out.println(test);

	}

	

}
