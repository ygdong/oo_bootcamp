package oo3.exam;

public class Bread implements Diffable<Bread> {
    @Override
    public boolean isBetterThan(Bread other) {
        return false;
    }
}
