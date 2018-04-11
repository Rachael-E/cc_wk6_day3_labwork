import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Player player2;
    private Card card1;

    @Before
    public void before(){
        player1 = new Player("Ewa");
        player2 = new Player("Rachael");

        card1 = new Card(Rank.FIVE, Suit.SPADE);
    }

    @Test
    public void hasName(){
        assertEquals("Ewa",player1.getName());
        assertEquals("Rachael",player2.getName());
    }

    @Test
    public void hasEmptyHand(){
        assertEquals(0, player1.getHand().size());
    }

    @Test
    public void canReceiveCard() {
        player1.receiveCard(card1);
        assertEquals(1, player1.getHand().size());
        assertEquals(Card.class, player1.showCard().getClass());
    }

    @Test
    public void showCardWhenHandEmptyRetunsNull() {
        assertEquals(null, player1.showCard());
    }

}
