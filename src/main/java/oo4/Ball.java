package oo4;

import java.util.ArrayList;
import java.util.List;


public class Ball {
    private  int radius;
    private  int x;
    private  int y;
    private List<Behavior> behaviorList = new ArrayList<>() ;


    public Ball(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius=radius;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void addBehavior(Behavior behavior) {
        behaviorList.add(behavior);
    }

    public void update() {
        for (Behavior bouncing:behaviorList){
            bouncing.act(this);
        }
    }


}
