package oo5;

public enum Direction {
    N(0,1),S(0,-1),W(-1,0),E(1,0);

    private int x;
    private int y;

    Direction(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
