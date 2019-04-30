package oo3;

public class Rectangle implements GoodOrBadAble<Rectangle> {


    private final int length;
    private final int width;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public boolean isBetterThan(Rectangle another) {

        return Math.abs(this.length-this.width)<Math.abs(another.length-another.width);
    }


}
