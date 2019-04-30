package oo3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle1;
    private Rectangle rectangle2;
    private Rectangle rectangle3;

    @Before
    public void setUp() throws Exception {
        rectangle1 = new Rectangle(1,5);
        rectangle2 = new Rectangle(1,4);
        rectangle3 = new Rectangle(1,3);
    }


    @Test
    public void rectangle2_is_better_than1() {
        assertTrue(rectangle2.isBetterThan(rectangle1));
    }
}