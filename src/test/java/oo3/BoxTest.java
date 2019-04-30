package oo3;

import org.junit.Before;
import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.*;

public class BoxTest {

    private Cookie cookie1;
    private Cookie cookie2;
    private Cookie cookie3;


    private Rectangle rectangle1;
    private Rectangle rectangle2;
    private Rectangle rectangle3;

    @Before
    public void someCookies() {
        cookie1 = new Cookie(10);
        cookie2 = new Cookie(11);
        cookie3 = new Cookie(10);
    }

    @Before
    public void someRectangles() throws Exception {
        rectangle1 = new Rectangle(1, 5);
        rectangle2 = new Rectangle(1, 4);
        rectangle3 = new Rectangle(1, 3);
    }


    @Test
    public void can_get_best_rectangle() {
        Box<Rectangle> box = new Box<Rectangle>();

        Rectangle[] rectangles = {rectangle1, rectangle2, rectangle3};
        box.add(rectangles);

        Rectangle best = box.getBest();

        assertSame(rectangle3, best);

    }

    @Test
    public void the_best_by_my_flavor() {
        Box<Rectangle> box = new Box<Rectangle>();
        Rectangle[] rectangles = {rectangle1, rectangle2, rectangle3};
        box.add(rectangles);

        Rectangle best = box.getBestByMyFlovor(new Standard<Rectangle>() {
            public Rectangle compare(Rectangle left, Rectangle right) {
                int leftArea = left.getLength() * left.getWidth();
                int rightArea = right.getLength() * right.getWidth();
                if (leftArea > rightArea)
                    return left;
                else
                    return right;
            }
        });
        box.getBestByMyFlovor((left, right) -> right);


    }
}