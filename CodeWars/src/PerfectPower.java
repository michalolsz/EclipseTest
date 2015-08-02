/*
 * 
For each prime p <= log n:
Compute x = bn1/pc
If n = xp accept and halt
Reject and halt.
 */
import java.util.Arrays;


public class PerfectPower {
	public static int[] isPerfectPowers(int n) {  
		  for (int i = 2; ; i++) {
	            int root = (int) Math.round(Math.pow(n, 1.0 / i));
	            if (root < 2) return null;
	            if (Math.pow(root, i) == n) return new int[]{root, i};
	        }
	}
	  
	  public static int[] isPerfectPower(int n) {
		  int tab[]=new int[2];
		  int i=2;
		  	while(i<=2237){
		  		int j=3;
		  		System.out.println(i);
		  		while(n>=Math.pow(i, j)){	
		  			j++;
		  		}
		  		if(Math.pow(i, j-1)==n) {
		  			tab[0]=i;
		  			tab[1]=j-1;
		  			return tab;
		  		}
		  		i++;
		  	}
		  	return null;
	  }
	
  
	public static void main(String[] args) {
		System.out.println(Arrays.toString(isPerfectPowers(625)));

	}

}
