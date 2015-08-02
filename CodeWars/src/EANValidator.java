
public class EANValidator {
	public static boolean validate(final String eanCode) {
		int sum=0;
	      for(int i=0;i<eanCode.length()-1;i++)
	    	  if(i%2==0) sum=sum+Integer.parseInt(eanCode.charAt(i)+"");
	    	  else sum=sum+Integer.parseInt(eanCode.charAt(i)+"")*3;
	      System.out.println(sum);
	      if(sum%10==0) sum=0;
	      else sum=10-sum%10;

	      if(Integer.parseInt(eanCode.charAt(eanCode.length()-1)+"")==sum) return true;
	      else return false;
	    }

	public static void main(String[] args) {
		System.out.println(EANValidator.validate("4003301018398"));

	}

}
