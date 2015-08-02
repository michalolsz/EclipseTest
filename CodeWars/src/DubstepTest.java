import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class DubstepTest {
    @Test
    public void Test1() {
      assertEquals("WU", new Dubstep().SongDecoder("WUBWUBWUWUB"));
    }
    @Test
    public void Test2()
    {
       assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }
}