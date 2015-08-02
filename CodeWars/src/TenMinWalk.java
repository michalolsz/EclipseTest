
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
	  if(walk.length!=10) return false;
	  int[] tab=new int[4];
	  for(char znak:walk){
		  switch (znak){
			  case 'n': tab[0]++; break;
			  case 's': tab[1]++; break;
			  case 'w': tab[2]++; break;
			  case 'e': tab[3]++; break;
		  }
	  }
	  if(tab[0]==tab[1] && tab[2]==tab[3]) return true;
	  else return false;
  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
