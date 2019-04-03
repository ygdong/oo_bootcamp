package tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }



    @Test
    public void should_be_4_digits() {
        String code = game.generateCode();
        assertTrue("code is not 4 digits: "+code,code.matches("\\d{4}"));
    }

    @Test
    public void should_be_4A0B() {
        String score = game.match("1234","1234");
        assertEquals("4A0B",score);
    }

    @Test
    public void should_be_1A0B() {
        String match = game.match("1234", "1567");
        assertEquals("1A0B",match);
    }

    @Test
    public void should_be_0A1B() {
        String match = game.match("1234", "8761");
        assertEquals("0A1B",match);
    }
}