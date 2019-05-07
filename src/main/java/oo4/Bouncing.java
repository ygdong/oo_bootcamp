package oo4;

public class Bouncing implements Behavior{

    public static final int DOWN = 1;
    public static final int UP = -1;
    public static final int PACE = 9;
    private int direction = DOWN;

    @Override
    public void act(Ball ball) {
        if (outOfBottom(ball) &&direction==DOWN)
            direction = UP;
        else if (outOfTopEdge(ball) &&direction==UP)
            direction=DOWN;

        ball.setY(ball.getY()+ PACE * direction);
    }

    private boolean outOfTopEdge(Ball ball) {
        return ball.getY()-ball.getRadius()<=0;
    }

    private boolean outOfBottom(Ball ball) {
        return ball.getY()+ball.getRadius()>= BallWorld.HEIGHT;
    }


    public void setDirection(int direction) {
        this.direction = direction;
    }
}
