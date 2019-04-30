package oo2;

public class Rectangle implements ShapeAble {

    private  double length;
    private  double width;

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

    public String getName() {
        return "长方形";
    }

    @Override
    public String toString() {
        return "我的 Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
