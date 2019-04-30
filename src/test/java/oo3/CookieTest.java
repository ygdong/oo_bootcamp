package oo3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CookieTest {

    private Cookie cookie1;
    private Cookie cookie2;
    private Cookie cookie3;

    @Before
    public void someCookies() {
        cookie1 = new Cookie(10);
        cookie2 = new Cookie(11);
        cookie3 = new Cookie(10);
    }


    @Test
    public void cookie2_should_be_better() {
        assertTrue(cookie2.isBetterThan(cookie1));
    }

    @Test
    public void cookie1_should_not_be_better_than_cookie3() {
        assertFalse(cookie1.isBetterThan(cookie3));
    }


    @Test
    public void cookie2_is_best() {
        Box cookieBox = new Box();
        Cookie[] cookies = {cookie1,cookie2,cookie3};

        cookieBox.addCookies(cookies);

        Cookie  bestCookie = cookieBox.getBestCookies();

        assertSame(cookie2,bestCookie);

    }
}