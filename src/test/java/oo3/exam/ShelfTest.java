package oo3.exam;

import org.junit.Before;
import org.junit.Test;

public class ShelfTest {

    private Shelf<Apple> appleShelf;
    private Shelf<Bread> breadShelf;

    @Before
    public void setUp() throws Exception {
        appleShelf = new Shelf<Apple>();
        breadShelf = new Shelf<Bread>();

        appleShelf.add(new Apple());
        appleShelf.add(new Apple());
        appleShelf.add(new Apple());


        breadShelf.add(new Bread());
        breadShelf.add(new Bread());
        breadShelf.add(new Bread());
    }

    @Test
    public void get_bestApple() {
        Apple best = appleShelf.getBest();

    }

    @Test
    public void get_bestBread() {
        Bread best = breadShelf.getBest();

    }

    @Test
    public void get_best_apple_by_myFlavor() {
        Flavor<Apple> weightFlavor = new WeightFlavor();

        Apple biggest = appleShelf.getBest(new Flavor<Apple>() {
            @Override
            public boolean isBetterThan(Apple left, Apple right) {
                return left.getSize()>right.getSize();
            }
        });

        Apple weightest = appleShelf.getBest(weightFlavor);

        Apple sweetest = appleShelf.getBest(new Flavor<Apple>() {
            @Override
            public boolean isBetterThan(Apple left, Apple right) {
                return left.getSweet() > right.getSweet();
            }
        });
    }
}