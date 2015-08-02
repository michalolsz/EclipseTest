
public class DRoot {
  public static int digital_root(int n) {
	  String a=n+"";
	  int suma=0;
	  for(char znak:a.toCharArray()){
		  suma+=(int)znak-48;
	  }
	  if(suma>9) return digital_root(suma);
	return suma;
  }
  public static int digital_root2(int n) {
	    return (n != 0 && n%9 == 0) ? 9 : n % 9;
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
