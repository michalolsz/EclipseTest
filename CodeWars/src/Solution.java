import java.math.BigInteger;

public class Solution {
  public static int zeros(int n) {
	  int count = 0;  
	    for (int i=5; n/i>=1; i *= 5)
	          count += n/i;
	  return count;
  }
  public static BigInteger silnia(int n){
	  BigInteger suma=new BigInteger(new String("1"));
	  for(int i=1;i<=n;i++)
		  suma=suma.multiply(new BigInteger(i+""));
	  return suma;
  }

	public static void main(String[] args) {
		System.out.println(zeros(14));

	}

}
