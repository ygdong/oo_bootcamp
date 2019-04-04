package oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    private Circle circle;

    @Before
    public void setUp() throws Exception {
        circle = new Circle(10);
    }

    @Test
    public void area_should_be() {
        double area = circle.getArea();
        assertEquals(314,area,0.1);
    }

    @Test
    public void perimeter_should_be_() {
        double perimeter = circle.getPerimeter();
        assertEquals(62.8,perimeter,0.1);
    }
}