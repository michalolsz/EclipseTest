
public class zad3 {
	static void wypisz(int tab[][],int n,int m){
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++){
				System.out.print(tab[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		int n=2;
		int m=3;
		int[][] tab=new int[n][m];
		int[][] transposeMatrix=new int[m][n];
		
		for(int i=0;i<n;i++) 
			for(int j=0;j<m;j++)
				tab[i][j]=(int) (Math.random()*10);
		wypisz(tab, n, m);
		
		Watek5[] watki=new Watek5[n*m];
		int licznik=0;
		for (int i = 0; i <n; i++)
            for (int j = 0; j < m; j++){
            	watki[licznik]=new Watek5(tab,transposeMatrix,i,j);	
            	watki[licznik++].start();
            }
		Thread.sleep(100);
	    System.out.println();   
	    wypisz(transposeMatrix, m, n);
		
	}

}
