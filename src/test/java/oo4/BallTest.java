package oo4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BallTest {

    private Ball ball;
    private Bouncing bouncing;
    private Elastic elastic;

    @Before
    public void setUp() throws Exception {
        ball = new Ball(0, 0, 50);
        bouncing = new Bouncing();
        elastic = new Elastic();

    }

    @Test
    public void y_should_be_1() {
        ball.addBehavior(bouncing);
        ball.update();
        assertEquals(Bouncing.PACE,ball.getY());
    }

    @Test
    public void y_should_be_1_when_y_is_50() {
        ball.setY(ball.getRadius());
        ball.addBehavior(bouncing);
        bouncing.setDirection(Bouncing.UP);

        ball.update();

        assertEquals(ball.getRadius()+Bouncing.PACE,ball.getY());

    }

    @Test
    public void y_should_be_449_when_y_is_550() {
        ball.setY(BallWorld.HEIGHT-ball.getRadius());
        ball.addBehavior(bouncing);
        ball.update();
        assertEquals(BallWorld.HEIGHT-ball.getRadius()-Bouncing.PACE,ball.getY());
    }

    @Test
    public void shrink() {
        ball.addBehavior(elastic);
        ball.update();
        assertEquals(49,ball.getRadius());
    }

    @Test
    public void should_inflate_when_radius_0() {
        ball.setRadius(0);
        ball.addBehavior(elastic);
        ball.update();
        assertEquals(1,ball.getRadius());
    }
}