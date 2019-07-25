import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void setUp() {
        deck = new Deck();
        card = new Card(SuitType.SPADES, RankType.SEVEN);
    }

    @Test
    public void deckStartsOffEmpty() {
        assertEquals(0, deck.cardCount());
    }

    @Test

    public void deckhas52Cards() {
        deck.buildAndShuffle();
        assertEquals(52, deck.cardCount());
    }

}
