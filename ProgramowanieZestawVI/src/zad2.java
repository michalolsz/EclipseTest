import java.util.Arrays;


public class zad2 {
	static int j=0;
	static int i=0;
	static boolean wynik=false;
	public static boolean czyZawiera(int[] tab,int ile,int szukany) throws InterruptedException{
		int rozmiar=tab.length;
		int n=rozmiar/ile;
		for(i=0;i<ile;i++){
			Thread watek=new Thread(new Runnable() {
				public synchronized void run() {
					for(j=(i*n);j<(i+1)*n;j++){	
						if(tab[j]==szukany) wynik=true;			
					}		
				}
			});
			watek.start();
			watek.setName(i+"");
			System.out.println(watek);
			watek.join();			
		}
		
		return wynik;
	}

	public static void main(String[] args) throws InterruptedException {
		int n=10;
		int[] tab=new int[n];
		for(int i=0;i<n;i++) tab[i]=(int) (Math.random()*10);
		System.out.println(Arrays.toString(tab));	
		System.out.println(czyZawiera(tab, 5,4));

	}

}
