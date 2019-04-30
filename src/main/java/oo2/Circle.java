package oo2;

public class Circle implements ShapeAble {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }

    public double getPerimeter() {
        return 2*radius*3.14;
    }

    public String getName() {
        return "圆形";
    }
}
