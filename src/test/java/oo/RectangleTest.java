package oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(5,6);
    }

    @Test
    public void area_should_30() {
        double area = rectangle.getArea();
        assertEquals(30.0,area,0.01);
    }

    @Test
    public void perimeter_should_be_22() {
        double perimeter = rectangle.getPerimeter();
        assertEquals(22.0,perimeter,0.01);
    }

    @Test
    public void print() {

        System.out.println(rectangle);
    }
}