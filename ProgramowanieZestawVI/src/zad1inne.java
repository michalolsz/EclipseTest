import java.util.Arrays;


public class zad1inne {
	public static void main(String[] args) throws InterruptedException {
		int n=10;
		int[] tab=new int[n];
		int[] C=new int[n];
		for(int i=0;i<n;i++){
			tab[i]=(int) (Math.random()*10);
			C[i]=(int) (Math.random()*10);
		}
		System.out.println("Tablica C:");
		System.out.println(Arrays.toString(C));
		System.out.println("Tablica tab przed zerowaniem:");
		System.out.println(Arrays.toString(tab));
		Watek1[] watki=new Watek1[n];
		for(int i=0;i<n;i++){
			watki[i]=new Watek1(i, tab);
			watki[i].start();
		}
		Thread.sleep(10);
		System.out.println("Tablica tab po zerowaniu:");
		System.out.println(Arrays.toString(tab));
		Watek2[] watki2=new Watek2[n];
		for(int i=0;i<n;i++){
			watki2[i]=new Watek2(i, C,tab);
			watki2[i].start();
		}
		Thread.sleep(10);
		System.out.println("Tablica tab porownaniu:");
		System.out.println(Arrays.toString(tab));
		System.out.println("Tablica C:");
		System.out.println(Arrays.toString(C));
		Watek3[] watki3=new Watek3[n];
		for(int i=0;i<n;i++){
			watki3[i]=new Watek3(i,C,tab);
			watki3[i].start();
			if(watki3[i].isFirstZero()){
				break;
			}
		}
		
		
		
		
		



		
		

}
}
