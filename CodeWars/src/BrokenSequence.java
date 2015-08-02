import java.util.Arrays;


public class BrokenSequence {
	public int findMissingNumber(String sequence) {	
      int missing = 0;
      if(sequence==null || sequence.length()==0) return 0;
      String[] liczby=sequence.split(" ");
      int[] tab=new int[liczby.length];
      for(int i=0;i<liczby.length;i++)
    	  try{
    	  tab[i]=Integer.parseInt(liczby[i]);
    	  }
      catch(Exception e){
    	  return 1;
      }
      Arrays.sort(tab);
      System.out.println(Arrays.toString(tab));
      for(int i=1;i<tab[tab.length-1];i++)
    	  if(i!=tab[i-1]) return i;
      return missing;
    }
    
	public static void main(String[] args) {
		BrokenSequence test=new BrokenSequence();
		System.out.println(test.findMissingNumber("____"));

	}

}
