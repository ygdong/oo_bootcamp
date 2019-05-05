package oo3;

public class Box<E extends GoodOrBadAble<E>> {


    private E[] goodOrBadAbles;



    public E getBest() {
        E best = null;

        for (int i = 0; i< goodOrBadAbles.length; i++){
            if (best ==null)
                best = goodOrBadAbles[0];
            if (goodOrBadAbles[i].isBetterThan(best))
                best = goodOrBadAbles[i];
        }
        return best;
    }

    public void add(E[] goodOrBadAbles) {
        this.goodOrBadAbles = this.goodOrBadAbles;
    }


    public E getBestByMyFlovor(Standard<E> standard) {
        E best = null ;
        for (int i=0;i<goodOrBadAbles.length;i++){
            if (best == null)
                best = goodOrBadAbles[0];
            //best 和 goodOrBadAbles[i] 比较， 找最好的
            best = standard.betterOne(best,goodOrBadAbles[i]);
        }

        return best;
    }

    public void addCookies(Cookie[] cookies) {

    }
}
