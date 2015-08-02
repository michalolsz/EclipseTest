import java.util.Arrays;


public class CircleSorted {


    public boolean isCircleSorted(int[] a) {
    	int[] tab=new int[a.length];
    	tab=Arrays.copyOf(a,a.length);
    	Arrays.sort(tab);
    	System.out.println(Arrays.toString(tab));
    	for(int i=0;i<a.length;i++){
    			int tmp=a[0];
    		for(int j=0;j<a.length-1;j++)
    		{
    				a[j]=a[j+1];
    		}
    		a[a.length-1]=tmp;
    		if(Arrays.equals(a,tab)) return true;
    	}
		return false;
    }

	public static void main(String[] args) {
		int[] A={0,1,2,3,4,5};
		CircleSorted test=new CircleSorted();
		System.out.println(test.isCircleSorted(A));

	}

}
