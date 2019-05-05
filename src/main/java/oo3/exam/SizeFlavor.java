package oo3.exam;

public class SizeFlavor implements Flavor<Apple> {
    @Override
    public boolean isBetterThan(Apple left, Apple right) {
        return left.getSize() > right.getSize();
    }
}
