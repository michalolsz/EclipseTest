import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Max {
  public static int sequence(int[] arr) {
	  int max=suma(arr);
	  
	  for(int i=0;i<arr.length;i++)
		  for(int j=i+1;j<arr.length;j++){
			  int tab[]=Arrays.copyOfRange(arr, i, j+1);
			  int ile=suma(tab);
			  if(ile>max){
				  max=ile;
			  }
		  }
    return max;
  }
  public static int suma(int[] arr){
	  int suma=0;
	  for(int i=0;i<arr.length;i++)
		  suma+=arr[i];
	  return suma;
  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
