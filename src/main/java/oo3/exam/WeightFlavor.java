package oo3.exam;

public class WeightFlavor implements Flavor<Apple> {
    @Override
    public boolean isBetterThan(Apple left, Apple right) {
        return left.getWeight()>right.getWeight();
    }
}
