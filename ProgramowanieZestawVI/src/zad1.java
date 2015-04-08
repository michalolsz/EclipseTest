import java.util.Arrays;


public class zad1 {
	private int[] tab;
	private int rozmiar;
	
	public zad1(int n){
		this.rozmiar=n;
		tab=new int[n];
	}
	
	int j=0;
	int i=0;
	int wynik=-1;
	public int minimum(int C[]) throws Exception{
		for(j=0;j<rozmiar;j++){
		Thread watek=new Thread(new Runnable() {
			public void run() {
				tab[j]=0;		
			}
		});
		watek.start();
		watek.join();	
		}
		
		for(i=0;i<rozmiar;i++)
			for(j=0;j<rozmiar;j++){
				Thread watek=new Thread(new Runnable() {
					public void run() {	
						if(i!=j && C[i]<C[j]){
							tab[j]=1;
						}
					}
				});
				watek.start();
				watek.join();	
				}
		for(i=0;i<rozmiar;i++){
			Thread watek=new Thread(new Runnable() {
				public void run() {
					if(tab[i]==0) wynik=i;		
				}
			});
			watek.start();
			watek.join();	
			}
		return C[wynik];
	}

	public static void main(String[] args) throws Exception {
		int n=100;
		int[] tab=new int[n];
		for(int i=0;i<n;i++) tab[i]=(int) (Math.random()*100);
		System.out.println(Arrays.toString(tab));
		
		zad1 test=new zad1(n);
		System.out.println(test.minimum(tab));
		

	}

}
