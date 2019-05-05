package oo3.exam;

public class AppleSizeFlavor implements Flavor<Apple> {
    @Override
    public boolean isBetterThan(Apple left, Apple right) {
        return false;
    }
}
