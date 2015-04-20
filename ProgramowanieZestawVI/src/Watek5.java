
public class Watek5 extends Thread {
	private int[][] tab;
	private int[][] C;
	private int i;
	private int j;
	public Watek5(int tab[][],int C[][],int i,int j){
			this.tab=tab;
			this.C=C;
			this.i=i;
			this.j=j;
	}

	public void run() {
		C[j][i]=tab[i][j];
		
	}	

}
