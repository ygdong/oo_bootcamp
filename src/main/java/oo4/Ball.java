package oo4;

public class Ball {
    private  int radius;
    private  int x;
    private  int y;

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
}
