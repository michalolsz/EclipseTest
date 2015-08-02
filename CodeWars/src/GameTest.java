import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GameTest {

  private Game game = new Game();

  @Test
  public void testGame() {
    assertEquals(
      "small deck",
      "Steve wins 2 to 1",
      game.winner(new String[]{"A", "7", "8"}, new String[]{"K", "5", "9"})
    );
    
    assertEquals(
      "small deck",
      "Tie",
      game.winner(new String[]{"T"}, new String[]{"T"})
    );
  }
}