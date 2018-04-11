import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    private Card card1;
    private Card card2;

    @Before
    public void before(){
        card1 = new Card(Rank.FOUR, Suit.CLUB);
        card2 = new Card(Rank.QUEEN, Suit.DIAMOND);
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FOUR, card1.getRank());
        assertEquals(Rank.QUEEN, card2.getRank());
    }

    @Test
    public void hasSuit(){
        assertEquals(Suit.CLUB, card1.getSuit());
    }

    @Test
    public void rankHasValue(){
        assertEquals(4, card1.getRank().getValue());
        assertEquals(12, card2.getRank().getValue());
    }


}
