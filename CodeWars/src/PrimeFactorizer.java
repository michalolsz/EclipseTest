import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PrimeFactorizer{
  public Map<Long, Integer> factor(long n){
	  Map<Long,Integer> set=new HashMap<>();
	  List<Long> factors = new ArrayList<>();
	    while (n%2 == 0)
	    {
	        factors.add(2l);
	        n = n/2;
	    }
	 
	    for (int i = 3; i <= Math.sqrt(n); i = i+2)
	    {
	        while (n%i == 0)
	        {
	            factors.add((long)i);
	            n = n/i;
	        }
	    }
	    if (n > 2)
	       factors.add(n);
	  for(long a:factors){

		  if(set.containsKey(a)){
			  int counts=set.get(a)+1;
			  set.put(a, counts);
		  }
		  else set.put(a, 1);
	  }
	  System.out.println(set);
	  return set;
  }

	public static void main(String[] args) {
		PrimeFactorizer test=new PrimeFactorizer();
		test.factor(72057554846356487l);

	}

}
