package oo3.exam;

public class Apple implements Diffable<Apple>{
    @Override
    public boolean isBetterThan(Apple other) {
        return false;
    }

    public int  getSize() {
        return 0;
    }

    public int getWeight() {
        return 0;
    }

    public int getSweet() {
        return 0;
    }
}
