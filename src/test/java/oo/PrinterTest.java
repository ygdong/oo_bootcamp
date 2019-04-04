package oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {

    private Square square;
    private Printer printer;
    private Circle circle;

    @Before
    public void setUp() throws Exception {
        printer = new Printer();
        square = new Square(9);
        circle = new Circle(5);
    }

    @Test
    public void print_square() {
        printer.print(square);
    }

    @Test
    public void print_circle() {
        printer.print(circle);
    }

    @Test
    public void print_triangle() {
        Triangle triangle = new Triangle();
        printer.print(triangle);
    }


}