import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SequenceTest {
  
  @Test
  public void testArithmeticSequence_knownValues() {
    assertEquals("Wrong answer for first = 0 n = 55 d = 1", Sequence.nthterm(0, 55, 1), 55);
    assertEquals("Wrong answer for first = 0 n = 100 d = 5", Sequence.nthterm(0, 100, 5), 500);
    assertEquals("Wrong answer for first = 14 n = 4 d = 7", Sequence.nthterm(14, 4, 7), 42);
    assertEquals("Wrong answer for first = 10000 n = 99 d = -50", Sequence.nthterm(10000, 99, -50), 5050);
    assertEquals("Wrong answer for first = 10000 n = 110 d = -50", Sequence.nthterm(10000, 110, -50), 4500);
    assertEquals("Wrong answer for first = 0 n = 99 d = 1", Sequence.nthterm(0, 99, 1), 99);
  }
}
