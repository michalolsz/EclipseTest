import java.lang.reflect.Field;
import java.util.Arrays;
public class Guesser {
    public void guess() {
      for(Field field : WordSearch.class.getDeclaredFields()) {
        try {
          System.out.println(field.getName() + ": " + field.get(null));
        } catch(IllegalAccessException iae) {}
      }
    //LittleClass.isMySecret("notVeryWellProtected");
    }
    public static void main(String[] args) {
		Guesser test=new Guesser();
		test.guess();

	}
}