import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<Player>();
    }

    public Deck getDeck() {
        return deck;
    }

    public int playerCount() {
        return this.players.size();
    }
}
