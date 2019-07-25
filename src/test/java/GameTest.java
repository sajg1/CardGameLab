import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
        deck.buildAndShuffle();
        game = new Game(deck);
    }

    @Test
    public void canGetADeckOfShuffledCards() {
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void playersArrayListIsEmptyAtStart() {
        assertEquals(0, game.playerCount());
    }

}
