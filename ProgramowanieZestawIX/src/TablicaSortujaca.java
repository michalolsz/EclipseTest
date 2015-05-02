import java.util.Arrays;
import java.util.stream.Collectors;


public abstract class TablicaSortujaca {
	protected int[] dane;
	protected final int RozmiarM=1000;
	protected int Rozmiar;
	public TablicaSortujaca(){
		this.Rozmiar=0;
		dane=new int[RozmiarM];
	}
	public final void dodajElement(int liczba){
		if(Rozmiar>=RozmiarM) throw new ArrayIndexOutOfBoundsException("Przekroczono rozmiar tablicy");
		else{
			dane[Rozmiar]=liczba;
			Rozmiar++;
		}
	}
	public TablicaSortujaca(int... args){
		this();
		for(int arg:args){
			dodajElement(arg);
		}
		
	}
	public TablicaSortujaca(TablicaSortujaca inny){
		super();
		this.Rozmiar=inny.Rozmiar;
		dane=Arrays.copyOf(inny.dane, inny.Rozmiar);
	}
	public String toString(){
		String wynik="";
		for(int arg:dane)
			if(arg!=0)
			wynik+=arg+" ";
		return wynik.trim();
	}
	public abstract void sortuj();

	public static void main(String[] args) {
		//TablicaSortujaca test=new TablicaSortujaca(1,2,3);
		//System.out.println(test);

	}
	

}
