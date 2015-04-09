import java.util.Arrays;


public class Watek4 extends Thread {
	private int id;
	private int[] tab;
	private int n;
	private int ile;
	private int p;
	private int szukany;
	private boolean wynik=false;
	public Watek4(int id,int tab[],int p,int szukany){
			this.id=id;
			this.tab=tab;
			this.n=tab.length;
			this.szukany=szukany;
			this.p=p;
			this.ile=n/p;
			
	}
	public long getId(){
		return id;
	}
	public void run() {
		for(int j=(int) (getId()*ile);j<(getId()+1)*ile;j++){	
			if(tab[j]==szukany) {
				setWynikTrue();	
			}
		}			
	}
	public void setWynikTrue(){
		wynik=true;
	}
	public boolean getWynik(){
		return wynik;
	}

}
