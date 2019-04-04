package oo;

public class Square extends Rectangle{

    public Square(double side) {
        super(side,side);
    }

    @Override
    public String getName() {
        return "正方形";
    }
}
