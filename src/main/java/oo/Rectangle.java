package oo;

public class Rectangle {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return length*2+width*2;
    }

    @Override
    public String toString() {
        return "我的 Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
