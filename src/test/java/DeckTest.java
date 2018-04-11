import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck myDeck;

    @Before
    public void before() {
        myDeck = new Deck();
    }


    @Test
    public void myDeckHas52Cards() {
        assertEquals(52, myDeck.getCardsInDeck().size());
    }

    @Test
    public void firstCardInDeckIsAceOfHearts() {
        assertEquals(1, myDeck.getCard().getRank().getValue());
        assertEquals("HEART", myDeck.getCard().getSuit().name());
        assertEquals(Rank.ACE, myDeck.getCard().getRank());
    }

    @Test
    public void removeCardFirstCardInDeckIsNowTwoOfHearts() {
        myDeck.removeCard();
        assertEquals(2, myDeck.getCard().getRank().getValue());
        assertEquals("HEART", myDeck.getCard().getSuit().name());
        assertEquals(Rank.TWO, myDeck.getCard().getRank());
    }

}
