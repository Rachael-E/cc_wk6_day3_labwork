public class Game {

    private Player player1, player2;
    private Deck myDeck;

    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.myDeck = new Deck();
        myDeck.shuffleDeck(); // this should change the ordered deck to a shuffled version
    }

    public Player getPlayer1(){
        return this.player1;
    }

    public Player getPlayer2(){
        return this.player2;
    }

    public Deck getDeck() {
        return this.myDeck;
    }

    public void dealCardToPlayers(Player player){
        // remove first card from the deck and give it to a player
        myDeck.removeCard()
    }

}
