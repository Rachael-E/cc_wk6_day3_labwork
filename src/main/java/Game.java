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

        Card cardtoDeal = myDeck.removeCard();
        player.receiveCard(cardtoDeal);

        //A shorter version of this:
        //player.receiveCard(myDeck.removeCard());
    }

    public Player checkWinner(){
        int score1 = player1.getHand().get(0).getRank().getValue();
        int score2 = player2.getHand().get(0).getRank().getValue();


        if (score1 < score2) {
            return player2;
        }
        else if (score1 > score2) {
            return player1;
        }
        else {
            return null;
        }
        }

     public Player playGame(Player player1, Player player2) {
        dealCardToPlayers(player1);
        dealCardToPlayers(player2);
        return checkWinner();
     }

    }
//    check winner takes two players and checks values of cards. returns the winner of the game.



