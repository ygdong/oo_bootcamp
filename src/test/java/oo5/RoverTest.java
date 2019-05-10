package oo5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoverTest {

    private Rover rover;

    @Before
    public void setUp() throws Exception {
        rover = new Rover();
    }

    @Test
    public void should_be_00W_when_L() {
        rover.command('L');
        Position position = rover.getPosition();
        assertEquals(new Position(0,0,Direction.W),position);
    }

    @Test
    public void should_be_00W_When_LLLLL() {
        rover.command("LLLLL");
        assertEquals(new Position(0,0,Direction.W),rover.getPosition());
    }

    @Test
    public void should_be_S_when_RR() {
        rover.command('R');
        rover.command('R');
        assertEquals(new Position(0,0,Direction.S),rover.getPosition());
    }

    @Test
    public void should_be_01N_when_M() {
        rover.command('M');
        assertEquals(new Position(0,1,Direction.N),rover.getPosition());
    }

    @Test
    public void should_be_10E_after_RM() {
        rover.command('R');
        rover.command('M');
        Position position = rover.getPosition();
        Position should = new Position(1, 0, Direction.E);
        assertEquals(should,position);
    }

    @Test
    public void should_be_0minus1S_after_RRM() {
        rover.command("RRM");
    }
}