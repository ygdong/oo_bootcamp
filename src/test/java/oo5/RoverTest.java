package oo5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoverTest {


    private Rover rover;
    private Interpreter interpreter;

    @Before
    public void setUp() throws Exception {
        rover = new Rover();
        interpreter = new Interpreter(rover);
    }

    @Test
    public void should_be_00W_when_L() {
        interpreter.command('L');
        Position position = rover.getPosition();
        assertEquals(new Position(0,0,Direction.W),position);
    }

    @Test
    public void should_be_00W_When_LLLLL() {
        interpreter.command("LLLLL");
        assertEquals(new Position(0,0,Direction.W),rover.getPosition());
    }

    @Test
    public void should_be_S_when_RR() {
        interpreter.command('R');
        interpreter.command('R');
        assertEquals(new Position(0,0,Direction.S),rover.getPosition());
    }

    @Test
    public void should_be_01N_when_M() {
        interpreter.command('M');
        assertEquals(new Position(0,1,Direction.N),rover.getPosition());
    }

    @Test
    public void should_be_10E_after_RM() {
        interpreter.command('R');
        interpreter.command('M');
        Position position = rover.getPosition();
        Position should = new Position(1, 0, Direction.E);
        assertEquals(should,position);
    }

    @Test
    public void should_be_0minus1S_after_RRM() {
        interpreter.command("RRM");
    }
}