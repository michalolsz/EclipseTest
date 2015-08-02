import java.util.Arrays;

public class AreSame {
	public static boolean comp2(int[] a, int[] b) {
    for(int i=0;i<a.length;i++){
    	a[i]=a[i]*a[i];
    }
    Arrays.sort(a);
    Arrays.sort(b);
    if(Arrays.equals(a,b)) return true;
    else return false;
  }
	public static boolean comp(int[] a, int[] b) {
	    return Arrays.equals(Arrays.stream(a).map(i->i*i).sorted().toArray(),Arrays.stream(b).sorted().toArray());
	  }
}