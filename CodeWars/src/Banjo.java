public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    if((name.charAt(0)=='r') || (name.charAt(0))=='R') return ""+name+" plays banjo";
    else return ""+name+" does not play banjo"; 
  }
  public static void main(String[] args) {
		
		String a="abcd    sadasdsa";
		a=a.replaceAll("\\s{3,}", " ");
		System.out.println(a);
	}
}