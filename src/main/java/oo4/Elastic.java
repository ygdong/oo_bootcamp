package oo4;


public class Elastic implements Behavior {


    public static final int SHRINK = -1;
    public static final int INFLATE = 1;
    public static final int STEP = 1;
    private int direction = SHRINK;

    @Override
    public void act(Ball ball) {
        if (ball.getRadius() <= 0 && direction == SHRINK)
            direction = INFLATE;
        if (outOfEdge(ball)&&direction==INFLATE)
            direction = SHRINK;
        ball.setRadius(ball.getRadius() + STEP *direction );
    }

    private boolean outOfEdge(Ball ball) {
        return ball.getX()-ball.getRadius()<=0||ball.getY()-ball.getRadius()<=0||ball.getX()+ball.getRadius()> BallWorld.WIDTH||ball.getY()+ball.getRadius()>=BallWorld.HEIGHT;
    }
}
