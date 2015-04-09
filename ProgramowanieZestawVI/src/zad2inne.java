import java.util.Arrays;


public class zad2inne {

	public static void main(String[] args) throws InterruptedException {
		int n=10;
		int[] tab=new int[n];
		for(int i=0;i<n;i++){
			tab[i]=(int) (Math.random()*10);
		}
		System.out.println(Arrays.toString(tab));
		boolean wynik=false;
		int szukany=5;
		int p=5;
		Watek4[] watki=new Watek4[p];
		for(int i=0;i<p;i++){
			watki[i]=new Watek4(i,tab,p,szukany);	
			watki[i].start();
		}
		for(int i=0;i<p;i++){
			if(watki[i].getWynik()) wynik=true;
		}
		Thread.sleep(10);
		if(wynik==true) System.out.println("Tablica zawiera wartosc "+szukany);
			else System.out.println("Tablica nie zawiera wartosc "+szukany);
		

	}

}
