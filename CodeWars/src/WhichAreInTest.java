import static org.junit.Assert.*;
import org.junit.Test;

public class WhichAreInTest {
	@Test
	public void test1() {
		String a[] = new String[]{"tarp","tarp", "mice", "bull" };
    	String b[] = new String[] { "lively", "alive", "tarpy", "sharp", "armstrong" };
    	String r[] = new String[] {"tarp"};
		assertArrayEquals(r, WhichAreIn.inArray(a, b));
	}
}