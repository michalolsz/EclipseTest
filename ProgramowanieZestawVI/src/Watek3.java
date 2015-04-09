
public class Watek3 extends Thread {
	private int id;
	private int[] tab;
	private int[] C;
	private int n;
	private int wynik=0;
	public Watek3(int id,int C[],int tab[]){
			this.id=id;
			this.tab=tab;		
			this.C=C;
			this.n=tab.length;
	}
	public long getId(){
		return id;
	}
	public void run() {
		if(tab[(int) getId()]==0) System.out.println("Najmniejsza wartosc to "+C[(int) getId()]);		
	}

}
