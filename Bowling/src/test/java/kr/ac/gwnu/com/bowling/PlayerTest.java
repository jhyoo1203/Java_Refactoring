package kr.ac.gwnu.com.bowling;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    Player player;

    @Before
    public void setUp() {
        player = new Player("유재현");
    }

    @After
    public void tearDown() {
        player = null;
    } 

    @Test
    public void test_constructor() {
        assertNotNull(player);
        assertEquals("유재현", player.getName());
    }
}
