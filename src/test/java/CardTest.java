import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp() {
        card = new Card(SuitType.SPADES, RankType.SEVEN);
    }
     @Test
    public void hasSuit() {
        assertEquals(SuitType.SPADES, card.getSuit());
     }

     @Test
     public void hasRank() {
        assertEquals(RankType.SEVEN, card.getRank());
     }

     @Test
    public void cardHasValue7() {
        assertEquals(7, card.getValueFromEnum());
     }


}
