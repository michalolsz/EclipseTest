
public class PalindromChecker {
	public boolean isPalindrome(String str) {
	  if(str==null) return false;
	  str=str.replaceAll("[\\s\\?\\'\\.\\!:;,`]+","").toLowerCase();
	  System.out.println(str);
      StringBuilder str2=new StringBuilder(str).reverse();
      if(str2.toString().equals(str)) return true;
      else return false;
	}


	public static void main(String[] args) {
		PalindromChecker test=new PalindromChecker();
		System.out.println(test.isPalindrome("Are we not pure? 'No sir!' Panama`s moody Noriega brags. 'It is garbage!' Irony dooms a man; a prisoner up to new era."));

	}

}
