import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Player player1, player2;
    private Game ourCardGame;

    @Before
    public void before(){
        player1 = new Player("Ewa");
        player2 = new Player("Rachael");

        ourCardGame = new Game(player1, player2);
    }

    @Test
    public void gameHasPlayers(){
        assertEquals("Ewa", ourCardGame.getPlayer1().getName());
        assertEquals("Rachael", ourCardGame.getPlayer2().getName());

    }

    @Test
    public void gameHasDeck() {
        assertEquals(Deck.class, ourCardGame.getDeck().getClass());
        assertEquals(52, ourCardGame.getDeck().getCardsInDeck().size());
    }


}
