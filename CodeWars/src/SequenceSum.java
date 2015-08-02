import java.util.Arrays;

public class SequenceSum {
	public static int[] sumOfN(int n) {
    int[] tab=new int[Math.abs(n)+1];
    tab[0]=0;
    int suma=0;
    if(n>0){
    	for(int i=1;i<=n;i++){
    		suma+=i;
    		tab[i]=suma;
    	}	
    }
    else for(int i=0;i>=n;i--)
	{
		suma+=i;
		tab[Math.abs(i)]=suma;
	}
    System.out.println(Arrays.toString(tab));
    return tab;
  }
	public static void main(String[] args) {
		SequenceSum.sumOfN(-4);

	}
}