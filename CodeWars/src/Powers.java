import java.math.BigInteger;


public class Powers {
  public static BigInteger powers(int[] list) {
	  return BigInteger.valueOf(2).pow(list.length);
  }

	public static void main(String[] args) {
		
		Powers.powers(new int[]{1,2,3,4,5});

	}

}
