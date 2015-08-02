import java.util.*;

public class UniqueArray {
  public static int[] unique(int[] integers) {
	List<Integer> lista=new ArrayList<>();
	for(int i=0;i<integers.length;i++)
		if(!lista.contains(integers[i])) lista.add(integers[i]);
	int[] array = new int[lista.size()];
	for(int i=0;i<lista.size();i++)
		array[i]=lista.get(i);
	return array;
  }
  public static int[] unique2(int[] integers) {
      return Arrays.stream(integers).distinct().toArray();
  }
  public static void main(String[] args) {
	  int[] duplicatesInOrder1 = new int[]{1, 2, 3, 3, 2, 1, 2, 3, 1, 1, 3, 2};
	  UniqueArray.unique(duplicatesInOrder1);

	}
}
