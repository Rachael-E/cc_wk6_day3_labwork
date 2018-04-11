import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void receiveCard(Card givenCard){
        this.hand.add(givenCard);

    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public Card showCard(){

        if (this.hand.size() != 0) {
            return this.hand.get(0); // this will return the first card in player hand.
        }
        return null;
    }

    public String getName(){
        return this.name;
    }
}
