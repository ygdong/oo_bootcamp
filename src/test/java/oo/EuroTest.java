package oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EuroTest {

    private Euro euro;
    private Euro euro1;

    @Before
    public void setUp() throws Exception {
        euro = new Euro(5);
        euro1 = new Euro(5);
    }

    @Test
    public void should_be_equal() {
        boolean isEqual = euro.equals(euro1);
        assertTrue(isEqual);
    }

    @Test
    public void should_not_equal() {
        Euro euro2 = new Euro(6);
        assertNotEquals(euro,euro2);
    }

    @Test
    public void should_be_10_euro() {
       Euro added = euro.add(euro1);
       assertEquals(10,added.getValue());
    }
}