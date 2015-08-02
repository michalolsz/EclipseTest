import java.util.Arrays;
import java.util.List;


public class Game {

  public String winner(String[] deckSteve, String[] deckJosh) {
	  List list = Arrays.asList(new String[] {"2","3","4","5","6","7","8","9","T","J","Q","K","A"});
	  int pointsSteve=0;
	  int pointsJosh=0;
    for(int i=0;i<deckSteve.length;i++)
    {	
    	if(list.indexOf(deckSteve[i])>list.indexOf(deckJosh[i])) pointsSteve++;
    	else if(list.indexOf(deckSteve[i])<list.indexOf(deckJosh[i])) pointsJosh++;
    }

	if(pointsJosh==pointsSteve) return "Tie";
	else if(pointsSteve>pointsJosh) return "Steve wins "+pointsSteve+" to "+pointsJosh;
	else return "Josh wins "+pointsSteve+" to "+pointsJosh;
  }


	public static void main(String[] args) {
		Game game=new Game();
		System.out.println(game.winner(new String[]{"A", "7", "8"}, new String[]{"K", "5", "9"}));

	}

}
