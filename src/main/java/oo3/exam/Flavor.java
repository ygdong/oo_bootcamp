package oo3.exam;

public interface Flavor<T> {
    boolean isBetterThan(T left, T right);
}
