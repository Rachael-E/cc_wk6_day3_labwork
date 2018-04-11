import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Player player1, player2;
    private Game ourCardGame;
    private Card losingCard;
    private Card winningCard;
    private Card matchingCard;

    @Before
    public void before(){
        player1 = new Player("Ewa");
        player2 = new Player("Rachael");

        ourCardGame = new Game(player1, player2);

        losingCard = new Card(Rank.SIX, Suit.SPADE);
        winningCard = new Card(Rank.QUEEN, Suit.CLUB);
        matchingCard = new Card(Rank.QUEEN, Suit.DIAMOND);
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

    @Test
    public void playerIsDealtOneCard() {
        ourCardGame.dealCardToPlayers(player1);
        assertEquals(1, player1.getHand().size());
    }

    @Test
    public void whoWonWinsPlayer1(){
        player1.receiveCard(losingCard);
        player2.receiveCard(winningCard);
        assertEquals("Rachael", ourCardGame.checkWinner().getName());

    }

    @Test
    public void whoWonWinsPlayer2(){
        player1.receiveCard(winningCard);
        player2.receiveCard(losingCard);
        assertEquals("Ewa", ourCardGame.checkWinner().getName());

    }

    @Test
    public void whoWonWinsDraw(){
        player1.receiveCard(winningCard);
        player2.receiveCard(matchingCard);
        assertEquals(null, ourCardGame.checkWinner());

    }

    @Test
    public void playGame(){
        assertEquals("Ewa", ourCardGame.playGame(player1, player2).getName());

    }


}
