package oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {


    private Square square;

    @Before
    public void setUp() throws Exception {
        square = new Square(5);
    }

    @Test
    public void area_should_be_25() {
        double area = square.getArea();
        assertEquals(25,area,0.01);
    }

    @Test
    public void perimeter_should_be_20() {
        assertEquals(20,square.getPerimeter(),0.01);
    }
}