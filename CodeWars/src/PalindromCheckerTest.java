import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PalindromCheckerTest {

	private PalindromChecker pc;

	@Parameter
	public String str;
	@Parameter(value = 1)
	public boolean expected;

	@Before
	public void initialize() {
		pc = new PalindromChecker();
	}

	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{"race car", true}
		});
	}

	@Test
	public void testIsPalindrom() {
		assertEquals(expected, pc.isPalindrome(str));
	}

}