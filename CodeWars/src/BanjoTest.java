import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BanjoTest {
  @Test
  public static void PeopleThatPlayBanjo() {
    assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
    assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
  }
}