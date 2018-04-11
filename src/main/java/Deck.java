import java.util.ArrayList;
import java.util.Collections;

public class Deck {//type
    private ArrayList<Card> cardsInDeck;

    public Deck() {//action
        this.cardsInDeck = new ArrayList<>();

        for (Suit suit:Suit.values()) { // this method could also be used as a separate method: and called in the constructor. Can also shuffle the deck in the constructor.
            for (Rank rank:Rank.values()) {
                cardsInDeck.add(new Card(rank, suit));
            }
        }
    }

    public ArrayList<Card> getCardsInDeck() {
        return cardsInDeck;
    }

    public Card removeCard() {
        return cardsInDeck.remove(0);
    }

    public Card getCard() {
        return cardsInDeck.get(0);
    }

    public void shuffleDeck(){
        Collections.shuffle(cardsInDeck);
    }


}
