import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Steve");
    }

    @Test
    public void playerHasName() {
        assertEquals("Steve", player.getName());
    }
}
