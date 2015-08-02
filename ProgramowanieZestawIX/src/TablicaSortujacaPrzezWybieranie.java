
public class TablicaSortujacaPrzezWybieranie extends TablicaSortujaca {
	public TablicaSortujacaPrzezWybieranie(){
		super();
	}
	public TablicaSortujacaPrzezWybieranie(int... args){
		super(args);
	}


	@Override
	public void sortuj() {
		for(int i=0;i<=Rozmiar-1;i++){
			int smallest=i;
			for(int j=i+1;j<=Rozmiar;j++){
				if(dane[j]<dane[smallest])
					smallest=j;
			}
			int tmp=dane[i];
			dane[i]=dane[smallest];
			dane[smallest]=tmp;
		}
		
	}
	
	public static void main(String[] args) {
		TablicaSortujaca test=new TablicaSortujacaPrzezWybieranie(1,2,3,6,5,3,1);
		test.sortuj();
		System.out.println(test);

	}

}
