
public class Watek2 extends Thread {
	private int id;
	private int[] tab;
	private int[] C;
	private int n;
	public Watek2(int id,int C[],int tab[]){
			this.id=id;
			this.C=C;
			this.tab=tab;		
			this.n=tab.length;
	}
	public long getId(){
		return id;
	}
	public void run() {
		for(int j=0;j<n;j++)
				if(getId()!=j && C[(int) getId()]<C[j])
					tab[j]=1;
	}	

}
