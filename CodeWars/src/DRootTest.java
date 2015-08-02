import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DRootTest {
    @Test
    public void Tests() {
      assertEquals( "Nope!" , DRoot.digital_root2(16), 7);
      assertEquals( "Nope!" , DRoot.digital_root2(123), 6);
      assertEquals( "Nope!" , DRoot.digital_root2(194), 5);
      assertEquals( "Nope!" , DRoot.digital_root2(942), 6); 
    }
}